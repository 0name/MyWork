package Daily;

public class Task extends Data {    // дело, которое нужно сделать физически
    int length;         // продолжительность по времени

    public Task(String nazv, String description, int day, String month, int year, String dayOfWeek, int hour, int minute) {
        super(nazv, description, day, month, year, dayOfWeek, hour, minute);
        this.length = length;
    }
}
