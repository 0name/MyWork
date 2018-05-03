package HomeworkN1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Commands {
    public static File creatingNewFile() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя файла " + scanner);

        String fileSeporator = System.getProperty("file.separator"); // разделитель пути в текущей ОС
        String absoluteFilePath = "HomeworkN1" + fileSeporator + "file.txt"; // scanner;

        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(absoluteFilePath + " файл создан");
        } else {
            System.out.println("Файл " + absoluteFilePath + " уже существует");
        }
        return file;
    }

    // пишем в файл с помощью Files
    static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("HomeworkN1/file.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Используем потоки для копирования файла
    static void copyingFile(File source, File newFile) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(source);
            output = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer))>0){
                output.write(buffer, 0, length);
            }
        } finally {
            input.close();
            output.close();
        }

    }

/*    // простой и удобный метод копирования файла начиная с Java 7
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }*/

    public static void splitFile(File file) throws IOException{
        http://qaru.site/questions/776644/how-to-break-a-file-into-pieces-using-java
    }
}
