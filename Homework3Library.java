public class Homework3Library {
   /* 1. Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
   Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
   Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
   при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.

    Поля класса Book: author, title, pagesNum.
    Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.*/

    public static void main(String[] args) {
        Library lib = new Library();

        Book lordOTR = new Book("Tolkien", "Lord Of The Rings", 1137 );


    }
}

class Book{
    String author;
    String title;
    int pagesNum;

    public Book(String author, String title, int pagesNum){
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
    }
}

class Library{
    int quantity;

    void put(Book book, int quantity){

    }

    int get(Book, int quantity){

    }
}
