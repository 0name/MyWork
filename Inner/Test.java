package Inner;

public class Test {
    public static void main(String[] args) {
        Electrocar car1 = new Electrocar(1);
        car1.start();

        Electrocar.Batary bat1 = new Electrocar.Batary();
        bat1.charge();
    }
}
