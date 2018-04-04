package Daily;

public class Event extends Data{
    int priority;

    public Event(String nazv, String description, int day, String month, int year, String dayOfWeek, int hour, int minute) {
        super(nazv, description, day, month, year, dayOfWeek, hour, minute);
        this.priority = priority;
    }
}
