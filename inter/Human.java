package inter;

import Animals.domasticAnimal.DomasticAnimals;

public interface Human {
    //
    void setNaame(String name);     //можно указать значения
    String getName();           //методы становятся public.
                                // нельзя создать экземпляр интерфейса
}

interface Teacher extends Human {
    void teach (Pupil pupil);
}

interface Pupil extends Human {
    void study();
}

class FirstYearPupil implements Pupil, Teacher {
//    класс который реализует интерфейс
//    должен реализовать все его методы
    @Override
    public void setNaame(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void study() {

    }

    @Override
    public void teach(Pupil pupil) {

    }

    public static void main(String[] args){
        Pupil pupil = new FirstYearPupil();

    }
}

//Абстрактные классы могут иметь реализованные методы и нереализованные
abstract class DomasticAnimal {
    public String getName(){
            return "DomasticAnimal";
    }

    abstract void eat();
}

class Dog extends DomasticAnimal {

    @Override
    void eat() {

    }
}
    class Cat extends DomasticAnimal{

    @Override
    void eat() {

    }
}