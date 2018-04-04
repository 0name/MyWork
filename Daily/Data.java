package Daily;

public class Data {     // общие данные
    protected String nazv;
    protected String description;
    protected int day;
    protected String month;
    protected int year;
    protected String dayOfWeek;
    protected int hour;
    protected int minute;


    public Data (String nazv, String description, int day, String month, int year, String dayOfWeek, int hour, int minute){
        this.nazv = nazv;
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayOfWeek = dayOfWeek;
        this.hour = hour;
        this.minute = minute;
    }

    public void add(){
        System.out.println("Добавление новой записи");
    }

    public void edit(){
        System.out.println("Редактирование");
    }

    public void delete(){
        System.out.println("Удаление");
    }

    public void output(Members memb, Meeting place){        // Members передается
        System.out.println("Вывод информации");
       System.out.println("У Вас назначена " + nazv + " c " + memb.getName() + " на " + day + " " + month + " (" + dayOfWeek + "). Она состоится в " + hour + ":" + minute + " в " + place.getPlace() );
    }

    public static void main(String[] args) {
        Reminder rem1 = new Reminder("Поздравить", "День рожения у тети Маши", 12, "Сен",2018, "Пн", 10,30);
        rem1.add();

        Members pep = new Members("Мих", "инженер", "Microsoft");
       // rem1.output(pep, rem1);         // как сделать, чтобы не выводились

        Members mem = new Members("Мих", "инженер", "Microsoft");       //  я задумывал сделать так, чтобы new mem создавался при записи Встречи
        Meeting meet1 = new Meeting("Встреча", "по работе ", 12, "Сен",2018, "Пн", 10,30, "S-Pb", mem);

        meet1.add();
        meet1.output(mem, meet1);


    }
}
