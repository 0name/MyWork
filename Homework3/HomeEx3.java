package Homework3;
//Дом строется со следующими характеристиками:
//Что из низ задается через конструктор, а что потом - решайте сами
//1. какое-то количество подъездов
//2. какое-то количество этажей
//3. какое-то количество квартир на этаже
//4. адрес
//У дома должна быть возможность сообщить, сколько в нем квартир - метод
//У дома должна быть возможность показать адрес - метод
//У дома должна быть возможность сообщить, сколько людей в нем живет - метод
//
//Есть очередь людей (массив с объектами класса Human),
//каждый хочет заселиться в дом , но у каждого есть пожелание - этажность дома!
//
//Одновременно в дом можно заселить троих.
//house.add(); при вызове этого метода можно заселить только 3х людей
//
//Людей из списка можно заселять в дом (по квартире на человека),
//если в нем есть еще свободные квартиры
//и если их пожелание можно учесть (желаемый этаж должен быть в доме).
//
//Если человека нельзя поселить, потому что его пожелание не выполняется,
//он перемещяется в конец очереди.
//Если не хватило места - остается на прежнем месте, ждать нового дома

public class HomeEx3 {

    public static void main(String[] args) {
        Home home1 = new Home(2,9);
        home1.setFlat(20);
        home1.setAddress("С-Пб, ул. Ломоносова,д.9");
        System.out.println("В доме, расположенном по адресу " + home1.getAddress() + "\nПодъездов: " + home1.getPod() + ", этажей: " + home1.getFloor() + ". На каждом этаже " + home1.getFlat() + " квартир.");
        home1.setFlatsOnTheFloor(home1.getPod(), home1.getFloor(), home1.getFlat());
        home1.add(home1.restFlat);
    }
}

class Home {

    //    описание свойств класса
    private String adress;
    private int pod, floor, flatsOnThefloor;
    static int restFlat;

    //    конструктор
    public Home(int pod, int floor){
        this.pod = pod;
        this.floor = floor;
        this.restFlat = restFlat;
    }

    //    описание методов

    public void setAddress (String name){
        this.adress = name;
    }

    public String getAddress() {
        return adress;
    }

    public int getFlat() {
        return flatsOnThefloor;
    }

    public void setFlat(int flat) {
        this.flatsOnThefloor = flat;
    }

    public int getPod() {
        return pod;
    }

    public int getFloor() {
        return floor;
    }

    //У дома должна быть возможность сообщить, сколько людей в нем живет - метод
    public int getRestFlat() {

        return restFlat;
    }

    public int setFlatsOnTheFloor (int pod, int floors, int flats){
        int numbers = pod * floors * flats;
        System.out.println("Всего в доме " + numbers + " квартир");
        return numbers;
    }

    public int add(int num ){
        restFlat -= 3;
        System.out.println("В дом заселилось 3 человека");
        System.out.println("Сейчас в доме " + restFlat);
        return restFlat ;
    }

//    public class Line {
//        static Human[] fd = new Human [300];
//    }

    class Human{

    }



}

class Human{
    private String name;
    private int wantFlat;
}

