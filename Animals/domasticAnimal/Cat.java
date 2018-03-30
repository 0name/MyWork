package Animals.domasticAnimal;

import Animals.Animal;

public class Cat extends DomasticAnimals {
    public Cat(String name){
        super(name);
    }

    @Override // без этого просто создастся новый метод и это может привести к ошибке
    public void say(){
//        super.say();// вызов родительского класса
        System.out.println("Мяу - мяу");
    }

//    перегруз методов
    public void say(String text){
        System.out.println("cat say " + text);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.say();
        cat.say("Мяяууу");
        Dog dog = new Dog("Rich");
        dog.say();

//        множественного наследования java  не поддерживает, наследовать можно только один класс
        // полиморфизм наследования
        Animal animal = new Cat ("animal - cat");
        animal.say();

        Animal animal2 = new Dog ("animal - dog");
        animal2.say();
//            animal2.liveWithPeople();
//            animal2.liveWithPeople();
    }
}
