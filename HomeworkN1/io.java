package HomeworkN1;

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.*;
import java.util.Scanner;

import static HomeworkN1.Commands.creatingNewFile;
import static HomeworkN1.Commands.copyingFile;

//        1) Скопировать файл
//        2) Разбить/склеить файл. Размер куска задается
//        3) Посмотрите самостоятельно и попробуйте реализовать:
//        a) Зашифровать/ дешифровать файл паролем (XOR)
//        b) Зашифровать/ дешифровать файл другим файлом
public class io {
    public static void main(String[] args) throws IOException {

        copyingFile(creatingNewFile());

    }

/*    public static void creatingNewFile() throws IOException {
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
    }*/
}
