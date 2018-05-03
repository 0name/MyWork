package Patterns.Decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private static final DateFormat FORMAT = new SimpleDateFormat("yyyy-dd-MM HH:mm");

    private final String name;
    private final String surname;
    private final long registered;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
        registered = System.currentTimeMillis();

    }

    public String toString(){
        return name + " " + surname + " " + FORMAT.format(new Date(registered));
    }
}
