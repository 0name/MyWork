package Homework1;

public class CyclesEx1 {
//    1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    public static void main(String[] args){
        for (int n = 1000; n > 1; n += 3) // По условию нет конечного значения, поэтому n > 1 =)
            System.out.println(n);
    }
}
