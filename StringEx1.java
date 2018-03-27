import java.util.Scanner;

public class StringEx1 {
//    1) Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ");
        int input = in.nextInt();

        System.out.println("Entered string: " + input);

        System.out.println("Enter a substring ");

        System.out.println("New string: " + input);
    }
}
