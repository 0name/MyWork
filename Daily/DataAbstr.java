package Daily;

abstract class DataAbstr {
    protected String name, descr, date,time;

    public DataAbstr(String name, String descr, String date, String time) {
        this.name = name;
        this.descr = descr;
        this.date =date;
        this.time =time;
    }

    public void Add(DataAbstr Task1){
        Task1.name = this.name;
        System.out.println("Добавили задание ");
    }

    void Output(String name){
    }

    void Edit(String name){

    }

    void Delete(String name){

    }

    void Copy(String name){

    }
}

class Task extends DataAbstr{

    public Task(String name, String descr, String date, String time) {
        super(name, descr, date, time);
    }

    int lifetime;
    public Task(){
       super("1", "2", "3", "4");
       this.lifetime = 10;

    }
}

class Reminder extends DataAbstr{

    public Reminder(String name, String descr, String date, String time) {
        super(name, descr, date, time);
    }
}
