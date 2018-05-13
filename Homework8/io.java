package Homework8;

import Patterns.Command.Command;

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

        splitFile(originFile);

        mergeFiles(getListOfFiles2());

        encription(originFile);

        decryption();

    }
}
