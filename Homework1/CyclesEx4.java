package Homework1;

public class CyclesEx4 {
//    4) Проверьте,  является ли натуральное число — простым.
    public static void main(String[] args) {
        int natur = 7;
        int ind = 0;
        for (int n = 1; n < 100; n++){
            if (natur % n == 0)
                ind++;
        }
        if (ind == 2)
            System.out.println("Простое число " + natur );
        else
            System.out.println("Число " + natur + " не является простым");
    }
}
