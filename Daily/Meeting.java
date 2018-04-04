package Daily;

public class Meeting extends Data {     // встреча
    String place;                       // место встречи
    String members;                     // участники

    public Meeting(String nazv, String description, int day, String month, int year, String dayOfWeek, int hour, int minute) {
        super(nazv, description, day, month, year, dayOfWeek, hour, minute);
        this.place = place;
        this.members = members;
    }
}
