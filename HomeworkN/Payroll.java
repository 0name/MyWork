package HomeworkN;

public class Payroll {
    public static void main(String[] args) {
        Hourly man = new Hourly(12, "Peter");
        man.payroll();

        Fixed woman = new Fixed(21, "Ann");
        woman.payroll();

    }
}
