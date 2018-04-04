package lesson7;

public class FinalLesson {
    public static void main(String[] args) {

    }
}

class DinalExample{
//    final могут быть
//    переменные
//    методы
//    аргументы методов
//    локальные переменные методов
//    классы

//    переменные final
//    должны быть инициализированы в момент обхявления
    final int finalVar = 9; // чаще встречается в конструкторе, где создается там и объявляется
    int someInt;
    public void FinalExample(){
        this.someInt = 90;
//        finalVar = 90; нельзя присвоить новое значение переменной
    }
//    методы final
//    не могут быть переопределены
    final void finalVoid(){
        System.out.println("FinalVoid");
    }
}