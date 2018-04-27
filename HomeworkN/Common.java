package HomeworkN;

abstract public class Common {
    protected idGenerator id;            // имя сотрудника
    protected String name;            // имя сотрудника

    public Common(idGenerator ident, String name) {
        this.id = ident;
        this.name = name;
    }

    abstract public void payroll();


}
