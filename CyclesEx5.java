public class CyclesEx5 {
//    5) Выведите на экран первые 11 членов последовательности Фибоначчи.
//      Первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
    public static void main(String[] args){
    int a = 0;
    int b = 1;
        for (int f = 0; f <= 11; f++ ) {
            if (a != 0)
            System.out.println(f + " " + a);
            a = a + b;
            b = a - b;
        }
    }
}
