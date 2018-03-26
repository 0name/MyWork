import java.util.Arrays;
import java.util.Random;

public class MassivEx5 {
//    5) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//    Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args){
        int arr5 [] = new int[4];
        boolean status = false;
        Random random = new Random();

        for (int i = 0; i < arr5.length ; i++ ) {
            arr5[i] = random.nextInt(100) + 10;
//            if (arr5[i] < arr5 [i + 1])
//                status = 1;
        }
        int arr52 [] = arr5.clone();
        Arrays.sort(arr52);

        System.out.println(Arrays.toString(arr5));
        System.out.println( Arrays.equals(arr5, arr52) ? "Массив возрастающий" : "Массив НЕ ВОЗРАСТАЮЩИЙ ");
    }
}
