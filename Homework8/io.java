package Homework8;

import java.io.*;
import java.util.ArrayList;
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

        //splitFile(originFile);  // второй раз выводится сообщение "Введите размер файлов" как сделать что-бы соообщение не повторялось,
                                // а просто список файлов передавлся в качестве параметра для следующего метода-|
                                // или как выдернуть список файлов из метода splitFile                          |
                                // если сделать чтобы он (метод) не return-ил этот список                       |                                                                            |
        mergeFiles(splitFile(originFile));      //                                                          <---|

        encription(originFile);

        decryption();

    }
}
