package Daily;

public class Members {
    protected String name;    // имя человека, который будет или должен быть на встрече
    protected String title;   // его должность
    protected String company; // компания, в которой он работает

    public Members(String name, String title, String company){
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public String getName(){
        return this.name;
    }
}
