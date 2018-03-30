public class figures {
    /*2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
    Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).*/

    public static void main(String[] args) {
        Circle small = new Circle(1001, 4);
        small.CycleArea(4);
        small.CyclePer(4);       //почему снова нужно вводить радиус в скобках?
                                        // я же уже указал на 6й строке, что радиус равен 4 ?

        Rectangle med = new Rectangle(2001, 2,5);
        med.RectangleArea( 2, 5 );
        med.RectanglePer( 2, 5 );

        Triangle big = new Triangle(3001,5, 3, 6);
        big.TriangleArea(5, 3, 6);
        big.TrianglePer(5, 3, 6);
    }

}
class Circle{
    int index;
    int radius;

    public Circle(int index, int radius){
        this.index = index;
        this.radius = radius;
    }
//    создание метода для нахождения площади окружности
    public double CycleArea(int radius){
        double S = Math.PI * (int)Math.pow(radius, 2);
        System.out.println("Площадь окружности равна " + S);
        return S;
    }
//    создание метода для нахождения периметра окружности
    public double CyclePer(int radius){
        double P = 2 * Math.PI * radius ;
        System.out.println("Периметр окружности равен " + P);
        return P;
    }
}

class Rectangle{
    int index;
    int side1;
    int side2;

    public Rectangle(int index, int side1, int side2) {
        this.index = index;
        this.side1 = side1;
        this.side2 = side2;
    }
//    создание метода для нахождения площади прямоугольника
    public int RectangleArea(int side1, int side2){
        int S = side1 * side2 ;
        System.out.println("Площадь прямоугольника равна " + S);
        return S;
    }
//    создание метода для нахождения периметра прямоугольника
    public int RectanglePer(int side1, int side2){
        int P = (side1 + side2) * 2 ;
        System.out.println("Периметр прямоугольника равен " + P);
        return P;
    }

}

class Triangle{
    int index;
    int side1;
    int side2;
    int side3;

    public Triangle(int index, int side1, int side2, int side3) {
        this.index = index;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
//  создание метода для нахождения площади треугольника
    public double TriangleArea(int side1, int side2, int side3){
        double pp = (side1 + side2 + side3)/2;
        double S = Math.sqrt(pp * (pp-side1) * (pp-side2) * (pp - side3)) ;
        System.out.println("Площадь треугольника равна " + S);
        return S;
    }
//    создание метода для нахождения периметра треугольника
    public int TrianglePer(int side1, int side2, int side3){
        int P = side1 + side2 + side3 ;
        System.out.println("Периметр треугольника равен " + P);
        return P;
    }
}