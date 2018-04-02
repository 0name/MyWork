package School;

import School.Personal.Teachers.Teacher;
import School.Pupils.Pupil;

public class School {
    public static void main(String[] args){
        Pupil Andrew = new Pupil("Andrew", 11, "schoolboy", 3);
        Andrew.introducing();
        Andrew.say();
        Andrew.goToSchool();

        System.out.println();

        Teacher Mary = new Teacher("Mary", 32, "teacher", "Mathematics", 7);
        Mary.introducing();
        Mary.say();
        Mary.putGoodAstimate(); // как передать в эту строку имя ученика,
                                // чтобы на выходе получилось следующее: Сегодня я поставила хорошую оценку Andrew?


    }
}
