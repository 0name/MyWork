package HomeworkN;

abstract public class Base {
    protected int id;            // имя сотрудника
    protected String name;            // имя сотрудника

    protected String typeOfPayroll; // тип оплаты сотрудника

    public Base(String name, String typeOfPayroll) {
        this.name = name;
        this.typeOfPayroll = typeOfPayroll;
    }

    abstract public void payroll();


}
