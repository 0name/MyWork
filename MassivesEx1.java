import java.util.Arrays;

public class MassivesEx1 {
//     1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//    отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//    Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        for(int i=2; i <= 20; i++ ) {
            if (i % 2 == 0)
                a++;
        }
        int arr [] = new int[a];
        for(int i=2; i <= 20; i++ ) {
            if (i%2 == 0) {
                arr[b] = i;
                System.out.print(arr[b] + " ");
                b++;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
