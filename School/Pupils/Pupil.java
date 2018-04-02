package School.Pupils;

import School.People;

public class Pupil extends People {
    int numOfClass;

    public Pupil(String name, int age, String status, int numOfClass){
        super(name, age, status);
        this.numOfClass = numOfClass;
    }

    public void say (){
        System.out.println("I'm in the " + numOfClass + "th grade");
}

//    могут посетить урок
//    могут пропустить урок
//    могут сделать ДЗ
//    могут не сделать ДЗ
//    написать КР
//    не написать КР
}
