package streams.io;

// IO Stream - однонаправленная последовательность байт
// из источника в программу или наоборот

// потоки байт
// Классы, работающие с потоками байт наследуются от абстрактных
//java.io.InputStream
//java.io.OutputStream

import java.io.*;
import java.nio.charset.Charset;

public class ByteStream {
    //    java.io.File используется для представления файла или директории в программе
//    можно создать каталог, файл, копировать файл и т.д
//    основные методы
//    getPath()
//    String getName()
//    boolean isFile()
//    boolean isDirectory()
//    boolean exists()
//    long length()
//    boolean delete()
//    FileOutputStream - запись в файл
    private void writeToFile(String str, File file, boolean append) throws IOException {
        try (OutputStream out = new FileOutputStream(file, append)) { // появилось в java7 - эта конструкция сама закрывает файл. а так мы не можем оставить файл открытым
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            out.write(bytes);
        }
    }

    private String readWithoutTryRes(File file) throws IOException {
        InputStream in = null;
//
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            in = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray(), Charset.forName("UTF-8"));
        } finally {
            bout.close();
            if (in != null) {
                in.close();
            }
        }
    }

    private String readWithTryRes(File file) throws IOException{
        try (InputStream in = new FileInputStream(file); ByteArrayOutputStream bout = new ByteArrayOutputStream()){

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf))>0){
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray());
        }
    }

    private String readWithBuffer(File file) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(file)); ByteArrayOutputStream bout = new ByteArrayOutputStream()){

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf))>0){
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray());
        }
    }

    public static void main(String[] args) throws IOException {
        ByteStream bs = new ByteStream();
        File file = new File("tst.txt");
        bs.writeToFile("string1\nstring2\nstring3", file, true);

        System.out.println(bs.readWithoutTryRes(file));
    }
}
