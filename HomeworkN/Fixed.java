package HomeworkN;

public class Fixed extends Common {

    public Fixed(idGenerator id, String name) {
        super(id, name);
    }

    @Override
    public void payroll() {
        double zp = 20000;
        System.out.println("Фиксированная ЗП " + zp );
    }
}

