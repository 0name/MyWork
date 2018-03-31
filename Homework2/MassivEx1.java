package Homework2;

import java.util.Arrays;

public class MassivEx1 {
//     1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//    отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//    Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
    public static void main(String[] args){
        int arr [] = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr [i] = i * 2 + 2;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i * 2 + 2;
            System.out.print(arr[i] + "\n");
        }

    }
}
