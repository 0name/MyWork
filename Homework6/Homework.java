package Homework6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
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

        String path = "Homework6/wp.txt";
        WordsOfWarAndPeace(path, "war");
        Groups(path);
        Alf(path);
    }


    public static void WordsOfWarAndPeace(String filename, String word) throws IOException {
        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath());
        int words = 0;

        //String find = "war"; //передается в качестве параметра в метод

        for (String str : lines) {

            String [] arr = str.toLowerCase().replaceAll("\\p{Digit}|\\p{P}|\\p{Blank}}", "").trim().split(" ");
            if ( str.contains(word) && str.length() == word.length()) {
                //str.split(" ");
                words++; // считает общее кол-во слов, в том числе предлоги с артиклями и тп
            }else {
                System.out.println(Arrays.toString(arr));
            }
        }
//        System.out.println(lines);

        System.out.println("В файле " + words + " раз встречается слово \"war\" ");
//        System.out.println(Arrays.toString(arr));

//        List<String> newList = new ArrayList<>(); // создаем пустой массив
//        newList.addAll(lines);
//        System.out.println(newList.size());
//        System.out.println(a);
//        System.out.println(b);
    }

    public static void Groups(String filename) throws IOException {
        String [] arr;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath());
        for (String str : lines) {
             arr = str.replaceAll("\\p{Digit}|\\p{P}", "").split("");

        }

    }

    public static void Alf(String filename) throws IOException {
        String [] arr;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath());
    }

}