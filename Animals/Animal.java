package Animals;

public class Animal {
//    модификаторы доступа
//    public - виден везде
//    protected - виден только в рамках пакета, где находится класс и наследникам из любого пакета
//    private - виден только врамках своего класса
//    метод используемый в рамках класса должен быть всегда приватным(private) - это принцип инкапсуляции
//    default (без модификатора) виден только в рамках своего
    String name;

    public Animal(String name){ //у животных есть имя
        this.name = name;   // this и super в статических методах использовать нельзя
    }
    public void say(){
        System.out.println("I am animal");
    }
}
