package HomeworkN;

public class Payroll {
    public static void main(String[] args) {
        Hourly man = new Hourly("Peter");
        man.payroll();
        System.out.println(man.getId());

        Fixed woman = new Fixed( "Ann");
        woman.payroll();
        System.out.println(woman.getId());


    }
}
