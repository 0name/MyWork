import java.util.Random;

public class MassivEx7 {
//    7) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
//    Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

    public static void main(String [] args){
        int arr [][] = new int[5][8];
        Random random = new Random();
        int max = 0;

        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(199)-99;
                System.out.print(arr[i][j] + "  ");
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Максимум: " + max);
    }
}
