package HomeworkN;

abstract public class Common {
    protected int id;            // имя сотрудника
    protected String name;            // имя сотрудника

    public Common(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract public void payroll();


}
