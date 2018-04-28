package HomeworkIndividual;

import HomeworkIndividual.Common;

public class Hourly extends Common {

    public Hourly( String name) {
        super(name);
    }
    private double stavka = 150;

    @Override
    public void payroll() {
        double zp = 20.8 * 8 * stavka;
        System.out.println("Почасовая ЗП " + zp);
    }
}
