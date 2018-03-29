public class figures {
    /*2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
    Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).*/
    boolean select;

    public Circl(int index, int radius){
        this.index = index;
        this.radius = radius;
    }

    public Rectangl(int index, int size1, int size2){
        this.index = index;
        this.size1 = size1;
        this.size2 = size2;
    }

    public Triangl(int index, int base, int hight){
        this.index = index;
        this.base = base;
        this.hight = hight;
    }

//    создание метода для нахождения площади окружности
    public double CycleArea(){
            double S = Math.PI * (int)Math.pow(radius, 2);
    }

//    создание метода для нахождения площади прямоугольника
    public int RectangleArea(){
         int S = a * b ;
    }

//  создание метода для нахождения площади треугольника
    public int TriangleArea(){
         int S = 1/2 * (a * h) ;
    }


    public static void main(String[] args) {
        Cirlc small = new Circl(1001, 4);
        Rectangl med = new Rectangl();
        Triangl big = new Triangl();
    }
}
