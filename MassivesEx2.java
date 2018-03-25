import java.util.Arrays;
import java.util.Collections;

public class MassivesEx2 {
//    2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же
//    массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
    public static void main(String[] args){
        int arr [] = new int[50];

        for (int i = 0; i <= arr.length; i++){
            arr [i] = i * 2 + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--){
           // arr [i] = i * 2 - 1;
            System.out.print(arr[i] + " ");
        }

//                Arrays.sort(arr, Collections.reverseOrder());
//        for (int i = 50 - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
