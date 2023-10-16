package com.milliondollawinners;

import java.util.ArrayList;

public class Event {
    private String name;
    private Date date;
    private Location location;
    private ArrayList<String> riders;
    private String[] organizers;

    // constructor
    public Event() {
        name = "placeholder";
        date = null;
    }

    // parameterized constructor
    public Event(String name, int month, int day, int year) {
        this.name = name;
        this.date = new Date(month, day, year);
    }

    // methods
    public String toString() {
        return name + " " + date;
    }
}
