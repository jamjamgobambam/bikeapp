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
        date = new Date();
        time = new Time();
        location = new Location();
        riders = new ArrayList<String>();
        organizers = new String[0];

    }

    // parameterized constructor
    public Event(String name, int month, int day, int year, int hour, int minute) {
        this.name = name;
        this.date = new Date(month, day, year);
        this.time = new Time(hour, minute);
        location = new Location();
        riders = new ArrayList<String>();
        organizers = new String[0];
    }

    public Event(ArrayList<String> riders, String[] organizers) {
        name = "placeholder";
        date = new Date();
        time = new Time();
        location = new Location();
        this.riders = riders;
        this.organizers = organizers;

    }

    public ArrayList<String> getRiders() {
        return riders;
    }

    // methods
    public String toString() {
        return name + " " + date;
    }
}
