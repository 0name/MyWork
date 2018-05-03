package HomeworkN1;

import java.io.*;

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

    static void copyingFile(File source) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(source);
            File newFile = new File("newFile.txt");
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
}
