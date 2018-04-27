package HomeworkN;

public class Fixed extends Common {

    public Fixed(String name) {
        super(name);
    }

    @Override
    public void payroll() {
        double zp = 20000;
        System.out.println("Фиксированная ЗП " + zp );
    }
}

