package Inner;

/*
Основные вопросы
Из него видны:
- обычные и статичные методы и свойства (даже private)
- public и protected свойства
Его видно:
Может наследовать:
Может быть наследован:
Может имплементировать интерфейс.
Может содержать
*/


public class Electrocar {
    private int id;
    private static int id1;

public class Model extends Electrocar { // наследуем id и id1
    public Model(int id) {
        super(id);
    }

}

//    вложенный нестатический класс
    private class Motor{
        int motId;

    public Motor() {

    }

    public void startMotor(){
            System.out.println("Motor " + motId + " is starting...");
        }

    public Motor(int motId) {
        this.motId = motId;
    }

    public void setMotId(int motId) {

        this.motId = motId;
    }

    public int getMotId() {

        return motId;
    }
}

    public static class Batary{     //вложенный static класс не имеет доступа к полям класса Electrocar, если эти поля не static
        public void charge() {
//          System.out.println("Batary is charging ..." + id1); //static класс имеет доступ к полю id1 класса Electrocar, т.к. оно тоже static
            System.out.println("Batary is charging ..." + id1);
        }
    }

// конструктор
    public Electrocar(int id){
        this.id = id;
    }public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        int x =1;

        class someClass{        // этот вложенный класс имеет доступ к полям класса Electrocar
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar " + id + " is starting...");
    }
}
