package com.milliondollawinners;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> events;

    public Calendar() {
        events = new ArrayList<Event>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calendar:\n");
        for (Event event : events) {
            sb.append(event.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
