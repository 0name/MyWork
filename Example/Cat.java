package Example;

public class Cat extends DomesticAnimal {
    public Cat(String fam, String name, int age) {
        super(fam, name, age);
    }

    public void CatchMouse(){           // новый метод, который характерен только для кошек
        System.out.println("catch a mouse");
    }

    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
