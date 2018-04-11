package tmp;

import java.util.ArrayList;

public class CollectionEx {
    public static void main(String[] args) {
        ArrayListExamples();
    }

    public static void ArrayListExamples(){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Создан ArrayList - автоматически расширяемый массив, элементы которого могут повторяться");
        System.out.println("Метод size() возвращает размер массива " + list.size());

        System.out.println("Метод add() добавляет элемент массива и возвр. " + list.add("One" ) + " если этот элемент был добавлен");
        System.out.println("Тот же самый метод add() добавляет элемент массива и возвр. " + list.add("One" ) + " если этот элемент был добавлен");
        System.out.println("Размер массива " + list.size());

        System.out.println("У метода add есть перегруженная версия add(index, element), кот. позволяет добавить element в определенную позицию index");
        list.add(0,"second el");
        System.out.println(list);
        System.out.println("Размер массива " + list.size());
        System.out.println("В методе ensureCapacity() в скобках можно задать первоначальный размер массива ");
        System.out.println("Метод trimToSize() позволяет удалить не используемые(пустые) элементы массива ");
        System.out.println("Метод indexOf() позволяет найти элемент по содержимому и выводит его индекс ");
        System.out.println("Метод contains() возвращает " + list.contains("second el") + ", если искомый элемент есть в массиве");
        System.out.println("Метод set(index, element2) по index-у заменяет имеющийся елемент на element2");
        System.out.println(list);

        System.out.println("Метод remove() позволяет удалить элемент, как по индексу, так и по значению");
        System.out.println("Метод clear() удаляет все элементы массива");

    }
}
