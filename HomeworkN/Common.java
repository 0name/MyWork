package HomeworkN;

abstract public class Common {
    protected int id;            // имя сотрудника
    protected String name;            // имя сотрудника

    public Common( String name) {
        this.id = idGenerator.getId();
        this.name = name;

    }

    public int getId() {
        return id;
    }

    abstract public void payroll();


}
