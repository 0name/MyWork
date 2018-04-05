package Example;

public class Dog extends DomesticAnimal{
    public Dog(String fam, String name, int age) {
        super(fam, name, age); //fam и age наследовалось от самого главного класса родителя
                                // а name наследовалось от класса ниже (DomesticAnimal),
                                // который является родителем этого класса
    }
//  методы
    public void followAnOrder(){            // новые, которые характерны только для собак
        System.out.println("follows an order");
    }

    @Override
    public void sound(){
        System.out.println("Woof");
    }


}
