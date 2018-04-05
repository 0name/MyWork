package Example;

public class Animal {
    // описание, т.е. переменные которые содержат инфу
    String fam;    // название семейства
    int age;        // возраст
    //...

//    создание конструктора
    public Animal(String fam, int age){
        this.fam = fam;
        this.age = age;
    }

//    методы - что может делать
    public void go(){
        System.out.println("goes");
    }

    public void run(){
        System.out.println("runs");
    }

    public void stand(){
        System.out.println("stands");
    }

    public void sound(){
        System.out.println("sounds");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("cat", "Barsik", 8);
        System.out.println("Hi I am a " + barsik.fam + "\nMy name is " + barsik.name);
        System.out.println("I can make ");
        barsik.sound();

        Dog rich = new Dog("dog", "Rich", 5);
        System.out.println("Hi I am a " + rich.fam + "\nMy name is " + rich.name);
        System.out.println("I can make the following: ");
        rich.go();
        rich.run();
        rich.stand();
        rich.sound();
    }
}
