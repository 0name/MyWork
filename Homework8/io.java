package Homework8;

import java.io.*;
import java.util.List;

import static Homework8.Commands.*;

//        1) Скопировать файл
//        2) Разбить/склеить файл. Размер куска задается
//        3) Посмотрите самостоятельно и попробуйте реализовать:
//        a) Зашифровать/ дешифровать файл паролем (XOR)
//        b) Зашифровать/ дешифровать файл другим файлом
public class io {
    public static void main(String[] args) throws IOException {

        File originFile = creatingNewFile();
        writeUsingFiles(originFile);

        copyingFile(originFile);

        splitFile(originFile);

//        List listOfFiles = null;
//        while(originFile.exists()) {
//            listOfFiles.add(originFile);
//        }

    //    mergeFiles(listOfFiles );

    }

/*    public static void creatingNewFile() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя файла " + scanner);

        String fileSeporator = System.getProperty("file.separator"); // разделитель пути в текущей ОС
        String absoluteFilePath = "Homework8" + fileSeporator + "file.txt"; // scanner;

            File file = new File(absoluteFilePath);
            if (file.createNewFile()) {
                System.out.println(absoluteFilePath + " файл создан");
            } else {
                System.out.println("Файл " + absoluteFilePath + " уже существует");
        }
    }*/
}
