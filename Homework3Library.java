import java.util.Scanner;

public class Homework3Library {
   /* 1. Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
   Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
   Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
   при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.

    Поля класса Book: author, title, pagesNum.
    Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.*/

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        Library lib = new Library();
        Book lordOTR = new Book("Tolkien", "Lord Of The Rings", 1137 );
        lib.get(lordOTR, 1);

        System.out.println();

    }
}

public class Book{
    String author, title;
    int pagesNum;

    public Book(String author, String title, int pagesNum){
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }
    public int getPagesNum(){
        return this.pagesNum;
    }
}

class Library{
    int quantity = 10 ;

    void put(Book book, int quantity){
        System.out.println("Из библиотеки забрали книгу" );
        quantity--;
    }

    int get(Book book, int quantity){
        System.out.println("В библиотеку принесли книгу" );
        quantity++;
        return quantity;
    }
}
