import java.util.Arrays;

public class StringEx3 {
//    3) Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
//      Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
//      Например, если дана строка "дом 48, корпус 9, парадная 7, этаж 4", то в массиве должны оказаться числа 48, 9, 7 и 4   2) Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    public static void main(String [] args){
        String str = "дом 48, корпус 9, парадная 7, этаж 4";
        //String split1 [] = str.split(",");
        String split2 [] = str.split("[^\\d\\.]+");
     //   char chArray [] = split2.toCharArray();

        int arrInt [] = new int[4];

//        for (int i = 0; i < split2.length; i++){
//            if (Character.isDigit(split2[i]))
//                for (int j = 0; j < arrInt.length; j++){
//                    arrInt[j] = Character.getNumericValue(split2 [i]);
//                }
//        }
        System.out.println(str);
        //System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split2));
        System.out.println(Arrays.toString(arrInt));
    }
}
