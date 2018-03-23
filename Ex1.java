public class Ex1 {
//    1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//      Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
    public static void main(String[] args){
        double n = 8.5;
        double m = 11.45;
        double result;

        if (Math.abs(n - 10) < Math.abs(m - 10)) result = n ;
            else result = m;

            System.out.println("Ближайшее к 10 число: " + result);
    }
}
