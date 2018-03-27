package PACKAGE_NAME;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MassivEx6 {
//  6) Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера
//  из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю о том,
//  сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
//  то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное число: ");
        int i = sc.nextInt();
        while (i % 2 != 0) {
            System.out.println("Вы ввели нечетное число. \n Повторите ввод:");
            i = sc.nextInt();
        }
        int arr[] = new int[i];
        Random ran = new Random();
        int sum1 = 0;
        int sum2 = 0;
        for (int n = 0; n < arr.length; n++){
            arr[n] = ran.nextInt(11) - 5;
        }

        int sered = arr.length/2;
        for (int a = 0; a < sered; a++) {
            sum1 += Math.abs(arr[a]);
        }

        for (int b = sered; b<arr.length; b++){
            sum2 += Math.abs(arr[b]);
        }


        System.out.println(Arrays.toString(arr));
        if (sum1>sum2)System.out.println("сумма модулей левой половины массива больше");
        if (sum1<sum2)System.out.println("сумма модулей правой половины массива больше");
        else
            System.out.println("сумма модулей правой и левой половины равны");
    }
}
