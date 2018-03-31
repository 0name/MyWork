package Homework2;

import java.util.Arrays;
import java.util.Random;

public class MassivEx4 {
//    4) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
//    Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
//    (либо сообщите, что их средние арифметические равны).
    public static void main(String [] args){
        int arr41 [] = new int[5];
        int arr42 [] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        Random random = new Random();

        for (int i = 0; i < arr41.length ; i++ ) {
            arr41[i] = random.nextInt(6);
            sum1 = sum1 + arr41[i]  ;
        }
        double sred1 = (double)sum1/arr41.length;   // почему-то без double в скобках среднее арифметическое округляется до целых,
                                                    // вроде на лекции говорили, что для double это не нужно

        for (int i = 0; i < arr42.length ; i++ ) {  // можно ли как-нибудь через функцию задать второй массив?
            arr42[i] = random.nextInt(6);
            sum2 = sum2 + arr42[i]  ;

        }
    //    float sred2 = (float)(sum2/arr42.length); // на первой лекции писали, что такой вариант корректный,
        float sred2 = (float)sum2/arr42.length;   // но со скобками тоже округляется до целых

        System.out.println(Arrays.toString(arr41));
//        System.out.println(sum1);
//        System.out.println(sred1);
//        System.out.println(sum2);
//        System.out.println(sred2);
        System.out.println(Arrays.toString(arr42));
        if (sred1 == sred2)
            System.out.println("Ср.арифм. первого и второго массива равны " + sred1 );
        else
            System.out.println(sred1 > sred2 ? "Ср.арифм. первого массива больше"  : "Ср.арифм. второго массива больше" );
    }
}
