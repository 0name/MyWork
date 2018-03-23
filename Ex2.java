public class Ex2 {
//    2) В три переменные a, b и c записаны три вещественных числа.
//      Создать программу, которая будет находить и выводить на экран вещественные
//      корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        int c = 2;
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
}
