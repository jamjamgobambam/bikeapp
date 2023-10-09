package com.milliondollawinners;

public class Date {
    //instance variables
    private int month;
    private int day;
    private int year;

    // constructor(s)
    public Date() {
        this(1, 1, 1900);
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //methods
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    //accessors(getters)
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    //mutators(setters)
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
