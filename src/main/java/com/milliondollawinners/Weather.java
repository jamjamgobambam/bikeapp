package com.milliondollawinners;

public class Weather {
    // instance variables
    // yeah yeah yeah
    private int temp;
    private String condition;

    // constructors
    public Weather() {
        this(80, "sunny");
    }

    // parameterized constructor
    public Weather(int temp, String condition) {
        this.temp = temp;
        this.condition = condition;
    }

    // methods
    public String toString() {
        return temp + " degrees and " + condition;
    }

}
