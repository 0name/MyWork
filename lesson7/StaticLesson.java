package lesson7;

public class StaticLesson {

    public static void main(String[] args) {
//        доступ к статической переменным: имя_класса
//        System.out.println(StaticExample.staticVar);
        StaticExample staticExample1 = new StaticExample();
    }
}

class StaticExample{

//        cjplfybt cnfnbxtcrjq gthtvtyyjq
        static int staticVar = 0;
        int notStaticVar = 0;

        public StaticExample(){
            staticVar++;
            notStaticVar++;
        }

        public int getStaticVar(){
            return staticVar;
        }
        public int getNotStaticVar(){
            return notStaticVar;
        }


//    статические методы
    static void StaticVoid(){
//        могут вызывать только другие статические методы
//          могут работать со статическими переменными
//          в них нельзя обращаться к this и super
    }
}

//Начиная с JAVA 8 появилась возможность описывать статические методы
interface StaticInterface{

}