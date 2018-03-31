package Homework1;

public class Ex3 {
/*
    3) Создать программу, выводящую на экран наибольшую цифру любого трехзначного натурального числа.

    Примеры работы программы:
    В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
*/
    public static void main(String[] args) {
        int a = 776;

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
}
