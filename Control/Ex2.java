package Control;

import java.util.LinkedList;

public class Ex2 {
    // Написать LinkedList, Stack, Queue - generic
    // LinkedList

    //list.add("wrwerq");
    //stack.push("wrwerq");

//calss Node<N> {
//        int value;
//
//        Node next;
//
//    public Node(int value){
//        this.value = value;
//    }
    public static void main(String[] args) {
        LinkedList<String> testLst = new LinkedList<>();
        System.out.println("Добавляем данные в массив");
        testLst.add("one");
        testLst.add("two");
        testLst.addFirst("zero");
        testLst.addLast("four");
        testLst.add(3,"three");
        testLst.offerLast("five");
        System.out.println(testLst);

        System.out.println("Удаляем первый элемент");
        testLst.removeFirst();

        System.out.println("Удаляем последний элемент");
        testLst.removeLast();
        System.out.println(testLst);

        System.out.println("Удаляем елемент по индексу 2");
        testLst.remove(2);
        System.out.println(testLst);

    }
}

class Test {


}

