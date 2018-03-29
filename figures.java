public class figures {
    /*2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
    Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).*/

//    создание метода для нахождения площади окружности
    public double CycleArea(){
        double S = Math.PI * (int)Math.pow(radius, 2);
        return S;
    }

//    создание метода для нахождения площади прямоугольника
    public int RectangleArea(){
         int S = a * b ;
        System.out.println("Площадь прямоугольника равна " + S);
        return S;
    }

//  создание метода для нахождения площади треугольника
    public int TriangleArea(){
         int S = 1/2 * (a * h) ;
         return S;
    }


    public static void main(String[] args) {
        Circle small = new Circle(1001, 4);
        Rectangle med = new Rectangle(2001, 2,5);
        Triangle big = new Triangle(3001,5, 3);
    }

}
class Circle{
    int index;
    int radius;

    public Circle(int index, int radius){
        this.index = index;
        this.radius = radius;
    }
}

class Rectangle{
    int index;
    int size1;
    int size2;

    public Rectangle(int index, int size1, int size2) {
        this.index = index;
        this.size1 = size1;
        this.size2 = size2;
    }
}

class Triangle{
    int index;
    int base;
    int height;

    public Triangle(int index, int base, int height) {
        this.index = index;
        this.base = base;
        this.height = height;
    }
}