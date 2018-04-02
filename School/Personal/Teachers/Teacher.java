package School.Personal.Teachers;

import School.People;
import School.Pupils.Pupil;

public class Teacher extends People {
    String predmet;
    int stage;// стаж

public Teacher(String name, int age, String status, String predmet, int stage) {
    super(name, age, status);
    this.predmet =  predmet;
    this.stage = stage;
    }

    public void say(){
        System.out.println("I'm a " + predmet + " teacher.\nI've been teaching for " + stage + " years." );
    }

    public void putGoodAstimate(){ // поставить хорошую оценку
        System.out.println("Today I put a good raiting to ...");
    }

    public void putBadAstimate(){ // поставить плохую оценку

    }
}
