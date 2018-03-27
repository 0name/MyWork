import java.util.Scanner;

public class StringEx1 {
//    1) Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String input = new String(" Люблю грозу в начале мая, когда весенний первый гром ... ");
    //    System.out.println("Enter a string ");
    //    String input = in.next();

        input =  input.trim();
        System.out.println("Введите строку: " + input);

        System.out.println("Введите подстроку для поиска ");
        String inputSub = in.next();
            while(!(input.contains(inputSub))) {
                System.out.println("Введенная подстрока не найдена! \n Повторите ввод или наберите 'выход' ");
                inputSub = in.next();
                if(inputSub.contains("выход")) {
                    break;
                }
            }
        if (input.contains(inputSub)) {
            System.out.println("Введенная подстрока найдена \n Введите новую строку ");
            String newInputSub = in.next();
            String newStr = input.replace(inputSub, newInputSub);
            System.out.println("Новая строка: " + newStr);
        }
    }
}
