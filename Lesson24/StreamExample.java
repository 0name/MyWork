package Lesson24;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        countMostFrequentWords();

//        countChars();
//        streamIntermediateOperations();
//        streamTerminalOperation();
//        streamTerminalOperation2();
//        streamTerminalOperation3();
    }

    private static void countChars() {
        // Получаем поток из некоторого источника
        Integer charsNum = Stream.of("one", "two", "three")
                // Выполняем операцию трансформации
                .map(s -> s.length())
                // Выполняем терминальную операцию подсчета суммы
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(charsNum);
    }

    private static void countCharsExt() {
        // Получаем поток из некоторого источника
        Stream<String> wordStream = Stream.of("one", "two", "three");
        // Выполняем операцию трансформации
        Stream<Integer> charNumStream = wordStream.map(s -> s.length());
        // Выполняем терминальную операцию подсчета суммы
        Integer charsNum = charNumStream.reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(charsNum);
    }

    private static void streamFrom() {
        Collection<String> strings = new ArrayList<>();

        Stream<String> stream = strings.stream();

        Stream<Integer> intStream = Stream.of(1, 2, 3);

//        String[] strArr = new String[]{"a", "b", "c"};
//
//        Stream<String> stream = Arrays.stream(strArr);

//        Stream<Integer> intStream = Stream.iterate(0, i -> i + 1);

        IntStream range = IntStream.range(0, 100);

        int sum = IntStream.range(0, 100).sum();

        LongStream longStream = LongStream.builder().add(1).add(2).add(3).build();

        DoubleStream doubleStream = DoubleStream.of(2.5, 4.7);

//        Stream<String> parStream = new ArrayList<String>().parallelStream();
//
//        Stream<String> parStream = new ArrayList<String>().stream().parallel();


    }

    private static void streamIntermediateOperations() {
        // Создаем стрим из набора
        Stream.of("c", "b", "a", "c", "dd", "cool")
                // Оставляем только строки, длиной 1
                .filter(s -> s.length() == 1)
                // Оставляем только уникальные элементы
                .distinct()
                // Преобразуем в стрим символов
                .map(s -> s.charAt(0))
                // Сортируем
                .sorted()
                // Терминальная операция на каждом элементе
                .forEach(System.out::print);
    }

    private static void streamTerminalOperation() {
        // Создаем стрим
        Optional<String> res = Stream.of("c", "b", "a", "c", "dd", "cool")
                // Устанавливаем фильтр
                .filter(s -> s.length() == 2)
                // Первое же значение, удовлетворящее фильтру
                // возвращается и обработка стрима прекращается.
                // Если же значения нет, то вернется пустой
                // Optional<String>
                .findFirst();

        // Достаем значение, если есть.
        // А если нет, то возвращаем значение
        // по умолчанию
        String r = res.orElse("Not found");

        System.out.println(r);
    }

    private static void streamTerminalOperation2() {
        // Создаем стрим
        String res = Stream.of("c", "b", "a", "c", "dd", "cool")
                // Первым аргументом передаем начальное
                // значение, а вторым функцию, которая
                // выполняет конкатенацию всех элементов
                .reduce("", (i, s) -> i + s);

        System.out.println(res);
    }

    private static void streamTerminalOperation3() {
        // Создаем стрим
        List<Integer> res = IntStream.range(0, 100)
                // Преобразуем к Stream<Integer>
                .boxed()
                // Укладываем все эелементы в List
                .collect(Collectors.toList());

        System.out.println(res);
    }

    private static void countMostFrequentWords() throws IOException {
        Path wapPath = prepareFile();

        Map<String, Long> result =
                Files.lines(wapPath)
                        .parallel()
                        .map(line -> line.toLowerCase().replaceAll("\\pP", " "))
                        .flatMap(line -> Arrays.stream(line.split(" ")))
                        .map(String::trim)
                        .filter(word -> !"".equals(word))
                        .collect(groupingBy(identity(), counting()))
                        .entrySet()
//                        .stream()
                        .parallelStream()
                        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                        .limit(10)
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }

    private static void countMostFrequentWordsComments() throws IOException {
        Path wapPath = prepareFile();

        Map<String, Long> result =
                // Получаем стрим из файла, представляющий строки
                Files.lines(wapPath)
                        // Указываем, что он должен быть параллельным
                        .parallel()
                        // Убираем из каждой строки знаки препинания
                        // и приводим к нижнему регистру
                        .map(line -> line.toLowerCase().replaceAll("\\pP", " "))
                        // Каждую строку разбивваем на слова и уплощаем
                        // результат до стримма слов
                        .flatMap(line -> Arrays.stream(line.split(" ")))
                        // Обрезаем пробелы
                        .map(String::trim)
                        // Отбрасываем неввалидные слова
                        .filter(word -> !"".equals(word))
                        // Группируем с подсчетом слов
                        .collect(groupingBy(identity(), counting()))
                        // Получаем параллельный стрим на элементах Map
                        .entrySet().parallelStream()
                        // Сортируем элементы по частоте слов
                        // (первыми идут наиболее частые)
                        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                        // Оставляем только первые 10
                        .limit(10)
                        // Собираем из набора Entry в Map
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }

    private static Path prepareFile() throws IOException {
        InputStream in = StreamExample.class.getClassLoader().getResourceAsStream("wap.txt");

        File tmp = File.createTempFile("wap", "txt");
        tmp.deleteOnExit();

        Path wapPath = tmp.toPath();

        Files.copy(in, wapPath, StandardCopyOption.REPLACE_EXISTING);
        return wapPath;
    }
}
