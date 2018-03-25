import java.util.Arrays;
import java.util.Random;

public class MassivEx5 {
//    5) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//    Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args){
        int arr5 [] = new int[4];
        Random random = new Random();

        for (int i = 0; i < arr5.length ; i++ ) {
            arr5[i] = random.nextInt(100) + 10;
        }
        System.out.println(Arrays.toString(arr5));
    }
}
