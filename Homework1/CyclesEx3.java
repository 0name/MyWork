package Homework1;

public class CyclesEx3 {
//    3) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
    public static void main(String[] args){
        int  n = 1;
        for (int i = 1; i <= 20; i ++){
            n *= 2;
            System.out.println(i + " " + n);

            // Вопросы: 1. Можно ли при выводе использовать вычисления? Например: System.out.println(i + " " + n*= 2);
            //          2. Как можно максимально сократить код этой программы?
        }
    }
}
