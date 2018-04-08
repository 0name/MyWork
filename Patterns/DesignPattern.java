package Patterns;

public class DesignPattern {
//    Шаблон проектирования (паттерн)
//    повторимая архитектурная конструкция,
//    представляющая собой решение проблемы проектирования
//    в рамках некоторого частовозникающего контента

//    Основные паттерны:
//    порождающие - создают объекты по определенным сценариям
//    Singleton
//        Factory
//        Abstract Factory
//        Builder
//        Prototype
//    Структурные - определяют различные сложные структуры,
//    которые изменяют интерфейс уже существующих обхектов или
//    его реализацию (позволяют оптимизировать программу)
//
//    Поведенческие - определяют взаимодействие между объектами,
//    увеличивваю его гибкость
//    Observer
//    Visitor
//    Iterator
//    Strategy
//    Command
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstanse();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstanse();
    }
}
// В многопоточной среде есть разница между реализациями ниже
// Одиночка Singleton
// У Singleton_класса есть только экземпляр,
// и он продоставляет к нему точку доступа
class SingletonPattern {
    //приватный конструктор
    private SingletonPattern(){}

    public static final SingletonPattern INSTANCE = new SingletonPattern();

    public static SingletonPattern getInstanse(){
        return INSTANCE;
    }
}


class SingletonPattern2 {
    private static SingletonPattern2 instance;

    // приватный конструктор
    private  SingletonPattern2(){
        System.out.println("Patterns.SingletonPattern2");
    }

    public static SingletonPattern2 getInstance(){
        if (instance == null) {
            instance = new SingletonPattern2();
        }
        return instance;
    }
}



