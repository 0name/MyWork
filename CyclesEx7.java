public class CyclesEx7 {
/*
    7) Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
    что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
    public static void main(String[] args){
        int timesOfSim = 0;
        for (int hours = 0; hours < 24; hours++) { // часы
            int indOfHour0 = hours / 10;
            int indOfHour1 = hours % 10;
//            System.out.print(indOfHour0 + " " + indOfHour1 );
            for (int minutes = 0; minutes < 60; minutes++) {// минуты
                int indOfMin0 = minutes / 10;
                int indOfMin1 = minutes % 10;
//                System.out.print(indOfHour0 + " " + indOfHour1 );
//                System.out.print(":" + indOfMin0 + " " + indOfMin1);
//                System.out.println();
                if (indOfHour0 == indOfMin1 && indOfHour1 == indOfMin0){
                    timesOfSim++;
//                    System.out.println("       +1");
                    }
                }
        }
        System.out.println(timesOfSim);
    }

}
