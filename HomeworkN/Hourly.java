package HomeworkN;

public class Hourly extends Common {

    public Hourly( String name) {
        super(name);
    }
    double stavka = 1.2;

    @Override
    public void payroll() {
        double zp = 20.8 * 8 * stavka;
        System.out.println("Почасовая ЗП " + zp);
    }
}
