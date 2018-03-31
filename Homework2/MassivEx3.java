package Homework2;

import java.util.Arrays;
import java.util.Random;

public class MassivEx3 {
//    3) Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
//    Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    public static void main(String [] args){
        int arr3 [] = new int[15];
        Random random = new Random();
        int sumOfEven = 0;

        for (int i = 0; i < arr3.length; i++){
            arr3[i] = random.nextInt(10);
                if ((arr3[i]%2 == 0) && (arr3[i] != 0))
                    sumOfEven++;
        }
    System.out.println(Arrays.toString(arr3));
        System.out.println("Сумма четных элементов равна: " + sumOfEven);
    }
}
