package Example;

public class DomesticAnimal extends Animal{
    String name; // кличка животного - здесь расширяем описание класса, т.к. у диких животных кличек и имени нет
    public DomesticAnimal(String fam, String name, int age) {
        super(fam, age);
        this.name = name;
    }

    public void doSomeTricks (){    //домашние животные могут делать некоторые трюки
        System.out.println("does trick");
    }

    public void eatFromAPlate (){
        System.out.println("eats from a plate");    //домашние животные могут ести из тарелки
    }
}
