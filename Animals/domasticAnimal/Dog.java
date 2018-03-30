package Animals.domasticAnimal;

public class Dog extends DomasticAnimals{
    public Dog(String name){
        super(name);
    }

//    переопределение метода родительского класса
    @Override // без этого просто создастся новый метод и это может привести к ошибке
    public void say(){
//        super.say();// вызов родительского класса
        System.out.println("Гав - гав");
    }

}
