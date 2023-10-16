package com.milliondollawinners;
import java.util.ArrayList;

public class Event {
    private String name;
    private Date date;
    private Time time;
    private Location location;
    private ArrayList<String> riders;
    private String[] organizers;

    // constructor
    public Event() {
        name = "placeholder";
    }

    // parameterized constructor
    public Event(String name, int month, int day, int year, int hour, int minute) {
        this.name = name;
        this.date = new Date(month, day, year);
        this.time = new Time(hour, minute);
    }

    // methods
    public String toString() {
        return name + " " + date;
    }
}
