package Homework6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/*
1. Сосчитать частоту встречаемости слов в книге War and peace.
2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова: [the, war, jar, get, met...], в другую [on, up, no, of...].
3. Вывести топ 10 самых частых слов и фраз.
4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).
5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.
Плюс доделать задание с лекции
*/
public class Homework {
    public static void main(String[] args) throws IOException {


        WordsOfWarAndPeace("Homework6/wp.txt");
    }


    public static void WordsOfWarAndPeace(String filename) throws IOException {
        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath());
        int words = 0;
        int a = 0;
        int b = 0;

        for (String str : lines) {
            if (str.contains(" war ")) {
                //str.split(" ");
                words++; // считает общее кол-во слов, в том числе предлоги с артиклями и тп
            }
//            if (str.length == 3)
            if (str.contains("a")){
                a++;
            }
            if (str.contains("b")){
                b++;
            }
        }
//        System.out.println(lines);

        System.out.println("В файле " + words + " раз встречается слово \"War\" ");

        List<String> newList = new ArrayList<>(); // создаем пустой массив
        newList.addAll(lines);
        System.out.println(newList.size());
        System.out.println(a);
        System.out.println(b);
    }

//    public static void Groups(String )

}