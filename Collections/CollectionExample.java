package Collections;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class CollectionExample {
    private String name;
    private int count;

    public CollectionExample(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionExample that = (CollectionExample) o;
        return count == that.count &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, count);
    }

    public static void main(String[] args) throws IOException {
        CollectionExample col = new CollectionExample("ColEx", 4);
        CollectionExample col2 = new CollectionExample("ColEx", 4);
        CollectionExample col3 = new CollectionExample("Example", 2);

        System.out.println(col.hashCode());
        System.out.println(col2.hashCode());
        System.out.println(col3.hashCode());

        System.out.println(col.equals(col2)); // сравнивает
        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("12"));
        System.out.println(strings.add("34"));
        System.out.println(strings.add("12"));
        System.out.println(strings.add("45"));

        for (String str: strings){
            System.out.println(str);
        }

        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()){
            System.out.println("with iterator " + iter.next());
        }

        Set<CollectionExample> colex = new HashSet<>();

        System.out.println(colex.add(col));
        System.out.println(colex.add(col2));

        colex.remove(col);
        colex.remove(col);

        System.out.println(colex.size());

        System.out.println(colex.contains(col2));

//        2. interface List -упорядоченная коллекция, может содержать дублирующиеся элементы

//        доступ, удаление, добавление по индексу
//        поиск элементов
//        замена элементов
//        операции с частью списка - subList (int from, int to);
//        ListIterator - расширенный итератор
        List<String> arrLst = new ArrayList<>();
        List<String> linkedLst = new LinkedList<>(); // есть инфа о предыдущем и следующем элементе
                                                    //  если нужно добавлять удалять эленты в середине тогда предпочтительнее использовать LinkedList, хоть он и медленнее
//        arrLst.subList(1, 3).clear();
        arrLst.size();

//        3. interface Queue - однонаправленная очередь
//           interface Deque - двунаправленная очередь
//        addFirst()
//        addLast()
//        getFirst()
//        getLast()
//        1, 2, 3, 4,

        Queue<String> que = new PriorityQueue<>();
        Queue<String> deq = new ArrayDeque<>();

//      для каждой строки
//        1. перевести в нижний регистр
//        2. убрать пробелы в начале и в конце строки
//        3. поместить в коллекцию только не пустые слова

            File fileTxt = new File("Collections/MyFile.txt");
            List<String> lines = Files.readAllLines(fileTxt.toPath());
            System.out.println(lines);
            lines.spliterator();
//          Создаем пустую коллекцию
             List<String> newLinkedLst = new ArrayList<>();
             for (String str1: lines){
//                 newLinkedLst.add(str1.toLowerCase().trim().replace(" ", ""));
                 newLinkedLst.add(str1.toLowerCase());
             }
            for (String wordL: newLinkedLst){
                System.out.println(wordL);
            }
            String[] myArray = lines.toArray(new String[lines.size()]);
             //myArray.split("");
             System.out.println(Arrays.toString(myArray));
             System.out.println("Размер: " + newLinkedLst.size());

//            txt.addFirst()
//            txt.toLowerCase();

//        на каждое действие два метода
//        element();  возвращает, но Не удаляет элемент из начала очереди (если очередь пуста => будет исключение)
//        peek(); возвращает без удаления элемента из начала очереди (null, если очередь пуста)
//        remove();
//        poll(); возвращает с удалением элемента из начала очереди (если очередь пуста => будет null)

    }

}
