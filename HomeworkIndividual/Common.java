package HomeworkIndividual;

abstract public class Common {
    protected int id;            // имя сотрудника
    protected String name;            // имя сотрудника

    public Common( String name) {
        this.id = HomeworkIndividual.idGenerator.getId();
        this.name = name;

    }

    public int getId() {
        return id;
    }

    abstract public void payroll();


}
