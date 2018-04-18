/*package Exception;

public class ExceptionBase {
    public static void tryExcaption() {
        String str = null;
        //   str.equals("string");
        //  Integer.parseInt("hgrtres");
        // можно выбросить аналогичное исключение,
        // воспользовавшись ключевым словом throw
//        throw new NumberFormatException("tryException");

        // I-ый вариант
*//*        Object string = "90";
        int[] arr = new int[10];
        try {
            Integer integer = (Integer) string;
        }
        catch (ClassCastException e){
            System.out.println("Integer case: " + e.getMessage());
        }

        System.out.println("After try catch");*//*


        Object string = "90";
        int[] arr = new int[10];
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                Integer integer = (Integer) string;
            } else {
                arr[10] = 90;
            }
        }
//        catch (ClassCastException e){
//            System.out.println("Integer case: " + e.getMessage());
//        }
////        еще один блок catch
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Integer case: " + e.getMessage());
//        }


        // II-ой вариант
//      начиная с java 7  исключения можно группировать
// через оператор |
//        catch (ClassCastException | ArrayIndexOutOfBoundsException e){
//            System.out.println("case: " + e.getMessage());
//        }

//        III- вариант через родителя
        catch (ClassCastException e) {
            System.out.println("integer case: " + e.getMessage());
        } catch (RuntimeException e) { // при любой ошибке
            System.out.println("All RuntimeException: " + e.getMessage());
        } finally {
//          блок, который будет выполнен в любом случае
            System.out.println("Finally block");
        }

        System.out.println("After try catch");


    }

    public static void tryExp2() throws Exception { // II-ой вариант поднимает ошибку на уровень выше
        throw new Exception("Exceptin here");
// I-ый вариант
        try {
            throw new Exception("Exception here");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
//        throw new Exception ("Exception here"); // ошибка
        }

        public static void main (String[] args){
//        tryExcaption();
              tryExp2(); // сюда поднялась ошибка
        }
    }
}*/
