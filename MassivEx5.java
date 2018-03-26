import java.util.Arrays;
import java.util.Random;

public class MassivEx5 {
//      5) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//    Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args){
        int arr5 [] = new int[4];
        boolean status = true;        // считаем что массив возрастающий
        Random random = new Random();

        for (int i = 0; i < arr5.length ; i++ ) {
            arr5[i] = random.nextInt(100) + 10;
            if (i > 0) {
                if (arr5[i] < arr5[i - 1]) {    //если какой-то из элементов массива не соответствует условиям
                    status = false;             // отсортированного по возрастанию массива присваеваем статус false
                }
            }
        }

//        int arr52 [] = arr5.clone();		// копируем массив
//        Arrays.sort(arr52);				// сортируем скопированный массив
        System.out.println(Arrays.toString(arr5));
//        System.out.println( Arrays.equals(arr5, arr52) ? "Массив возрастающий" : "Массив НЕ ВОЗРАСТАЮЩИЙ "); // проверяем старый массив и отсторитованный массив
        System.out.println( status == true ? "Массив возрастающий" : "Массив НЕ ВОЗРАСТАЮЩИЙ ");

    }
}
