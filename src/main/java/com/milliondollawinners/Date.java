package com.milliondollawinners;

public class Date {
    
    // instance variables
    private int month;
    private int day;
    private int year;

    // constructors
    // no-argument constructor AND/OR parameterized constructors
    public Date() {
        month = 1;
        day = 1;
        year = 1900;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // methods

    // accessor methods
    public int getMonth() {
        return month;
    }

    // mutator methods
    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        return month + "-" + day + "-" + year;
    }

}
