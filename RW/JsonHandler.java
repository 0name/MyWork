package RW;

public class JsonHandler extends ReadWrite {

    @Override
    public ReadWrite getInstance(String extension) {
        System.out.println("Файл Json");
        return new JsonHandler();
    }
}
