package Homework6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

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
        String findingWord = "war";

        WordsOfWarAndPeace(path, findingWord);
        Groups(path);
        Alph(path);
    }
//  1. Сосчитать частоту встречаемости слов в книге War and peace.
    public static void WordsOfWarAndPeace(String filename, String word) throws IOException {
        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath()); // создаем коллекцию в которую помещаем содержимое файла
        String arr [];
        int words = 0;

        for (String str : lines) {
            arr = str.toLowerCase().replaceAll("\\p{Digit}|\\p{P}|\\p{Blank}}", "").trim().split(" ");
            for(String s: arr){
                if ( s.contains(word) && s.length() == word.length()) {
                    words++;
                }
            }
        }
//        System.out.println(lines);
        System.out.println("Слово \"" + word + "\" встречается в тексте " + words + " раз ");
    }

//  2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова: [the, war, jar, get, met...], в другую [on, up, no, of...].
//  4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).
    public static void Groups(String filename) throws IOException {
        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath()); // создаем коллекцию в которую помещаем содержимое файла
        String arr [];
        Set<String> col = new HashSet<>();
        Set<String> col2 = new HashSet<>();
        File articl = new File("Homework6/articles.txt");
        List<String> articles = Files.readAllLines(articl.toPath()) ;
        articles.add("xx");
        articles.add("de");
        articles.add("hi");

        for (String str : lines) {
            arr = str.toLowerCase().replaceAll("\\p{Digit}|\\p{P}|\\p{Blank}}", "").trim().split(" ");
            for(String s: arr){
                if ( s.length() == 2)col.add(s);
                if ( s.length() == 3)col2.add(s);

                /*к заданию 4*/
                col.removeAll(articles);
                col2.removeAll(articles);
            }
        }
        System.out.println(col);
        System.out.println(col2);
    }

//  5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.
    public static void Alph(String filename) throws IOException {
        File fileWP = new File(filename);
        List<String> lines = Files.readAllLines(fileWP.toPath()); // создаем коллекцию в которую помещаем содержимое файла
        String arr [];
        int i=0;
        Map<String, Integer> alphabet = new HashMap<>();

        for (String str : lines) {
            arr = str.toLowerCase().replaceAll("\\p{Digit}|\\p{P}|\\p{Blank}|=", "").trim().split("");
            for(String s: arr){
                if(alphabet.containsKey(s)){
                    alphabet.put(s, alphabet.get(s)+1);
                }else{
                    alphabet.put(s,1);
                }
                i++;
                //System.out.println(alphabet.get(s));
            }
        }
       System.out.println(alphabet);
        System.out.println("Слово \"" );
    }
}