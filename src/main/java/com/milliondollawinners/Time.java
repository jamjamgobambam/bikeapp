package com.milliondollawinners;

public class Time {
    //instance variables
    private int hour;
    private int minute;

    // constructors
    public Time() {
        this(0, 0);
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    //methods
    public String toString() {
        return hour + ":" + minute;
    }

    //accessors
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }

    //mutators
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

}