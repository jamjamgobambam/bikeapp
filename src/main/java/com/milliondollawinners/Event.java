package com.milliondollawinners;

public class Event {
    private String name;
    private Date date;
    private Location location;
    private ArrayList<String> riders;
    private String[] organizers;

    // constructor
    public Event() {
        name = "placeholder";
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
