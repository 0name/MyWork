package Homework1;

public class Ex1 {

    public static void main(String[] args){
        ex1(8.5, 11.45);
        ex2(3,7,2);
        ex3(485);
        ex4(4, 0,-1);

    }

//    1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//      Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
    static void ex1(double a, double b){
        double n = a;
        double m = b;
        double result;

        if (Math.abs(n - 10) < Math.abs(m - 10)) result = n ;
            else result = m;

            System.out.println("Ближайшее к 10 число: " + result);
    }

//      2) В три переменные a, b и c записаны три вещественных числа.
//      Создать программу, которая будет находить и выводить на экран вещественные
//      корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
    static void ex2(int p, int y, int z ){
        int a = p;
        int b = y;
        int c = z;
        double D = Math.pow (b, 2)  - 4 * a * c ;

        if (D > 0) {
            double x1 = ( -b + Math.sqrt(D)) / (2 * a);
            double x2 = ( -b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            double x = - b  / 2 * a;
            System.out.println("x = " + x);
        } else
            System.out.println("Вещественных корней нет");
    }

//    3) Создать программу, выводящую на экран наибольшую цифру любого трехзначного натурального числа.
//
//    Примеры работы программы:
//    В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
    static void ex3(int x) {
        int a = x;

        int sot = a / 100;
        int dec = a % 100 / 10;
        int ed = a % 10;
        int res;

        if (sot > dec)
            res = sot;
        else
            res = dec;
        if (ed > res)
            res = ed;

        System.out.println("Наибольшая цифра: " + res);
    }

    /*   4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
           Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран
           последовательность a, b и c оказалась строго возрастающей.

       Числа в переменных a, b и c: 3, 9, -1
       Возрастающая последовательность: -1, 3, 9

       Числа в переменных a, b и c: 2, 4, 3
       Возрастающая последовательность: 2, 3, 4

       Числа в переменных a, b и c: 7, 0, -5
       Возрастающая последовательность: -5, 0, 7
   */
    static void ex4(int p, int r, int s){
        int a = p;
        int b = r;
        int c = s;

        if ( a > b ) {
            a = a + b; //   a=a+b-(b=a) почему?
            b = a - b;
            a = a - b;
        }
        if (a > c) {
            a = a + c;
            c = a - c;
            a = a - c;
        }
        if (b > c) {
            c = c + b;
            b = c - b;
            c = c - b;
        }

        System.out.println("Возрастающая последовательность: " + a + "," + b + "," + c);
    }
}
