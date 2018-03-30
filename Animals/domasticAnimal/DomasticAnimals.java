package Animals.domasticAnimal;

import  Animals.Animal; //импортируем только этот класс
import  Animals.*; //импортируем пакет целиком (все классы)

public class DomasticAnimals extends Animal{ //наследование
    public DomasticAnimals(String name){
        super(name);
//        можно его расширить
    }

    public void liveWithPeople(){
        System.out.println("I am live with people");
    }

//    public static void main(String[] args) {
//        DomasticAnimals da = new DomasticAnimals("DomAnimal");
//        da.say();
//        da.liveWithPeople();
////        da.name = "new name"; //нельзя проверить и такой способ не безопасен, нужно через сетеры
//    }
}
