package Exception;

public class TstExceptions {
    public static String getStr(String string) throws CheckedException{
        if (string.length()<4){
            throw new CheckedException("Слишком короткая строка");
        }
        return string;
    }

    public static int getInt(int i){
        if (i < 4){
            throw new UncheckedException("Слишком маленькое число");
        }
        return i;
    }

    public static void main(String[] args) { // Exception - это родитель класса CheckedException. Если выше написано throws Exception, то
        try {
            System.out.println(getStr("ww"));
        }
        catch (CheckedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(getInt(7)); // если значение меньше 4 будет ошибка, иначе будет выведено это значение
        System.out.println(getInt(2));
    //    System.out.println(getStr("qw"));
    }
}
