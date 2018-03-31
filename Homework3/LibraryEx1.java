package Homework3;

import java.util.ArrayList;

public class LibraryEx1{
       /* 1. Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
   Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
   Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
   при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.

    Поля класса Book: author, title, pagesNum.
    Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.*/

    public static void main(String[] args) {
        Library lib = new Library();

        System.out.println("Сейчас в библиотеке " + lib.quantity + " книг " + "\n");
        Book lordOTR = new Book("Толкен", "Властелин колец", 1137, 5 );
        lib.get(lordOTR, lordOTR.numbers);
        lib.put(lordOTR, 2);

        lib.output(lordOTR, lib.quantity);

        Book azbuka = new Book("Народ", "Азбука", 50, 2 );
        lib.get(azbuka, azbuka.numbers);
        lib.put(azbuka, 1);
        lib.output(azbuka, lib.quantity);

//        Book rem = new Book("Э.М. Ремарк", "Три товарища ", 137,5 );
//        lib.put(rem, 1);
//        lib.get(rem, 3);
//        lib.output(rem, lib.quantity);

        System.out.println("\n Всего в библиотеке осталось " + lib.quantity + " книг");
    }
}

class Book{
    String author, title;
    int pagesNum;
    int numbers = 5;

    public Book(String author, String title, int pagesNum, int numbers){
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
        this.numbers = numbers;
    }
}

class Library{
    int quantity = 0 ;
    //  Book book[] = new Book[this.quantity];
    ArrayList<Integer> list = new ArrayList<>(this.quantity);

    void put(Book book, int quantity){
        if (quantity <= this.quantity) {
            this.quantity = this.quantity - quantity;
            System.out.println("Из библиотеки забрали " + quantity + " кн. " + book.title);
        } else
            System.out.println("В библиотеке сейчас нет " + quantity + " кн. " + book.title);
    }

    public Book get(Book book, int quantity){
        if (quantity>0) {
            this.quantity = this.quantity + quantity;
            System.out.println("В библиотеку добавлено " + quantity + " кн. " + book.title);
        }
        return book;
    }

    public void output(Book book, int  quantity){
        System.out.println("В библиотеке сейчас " + quantity + " кн. " + book.title);

    }
}
