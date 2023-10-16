package com.milliondollawinners;

public class Weather {
    // instance variables
    // yeah yeah yeah
    private int temp;
    private String condition;
    private boolean goodTemp;

    // constructors
    public Weather() {
        this(80, "sunny");
    }

    // parameterized constructor
    public Weather(int temp, String condition) {
        this.temp = temp;
        /*
         * if (temp >= -40 && temp <= 120) {
         * this.goodTemp = true;
         * } else
         * this.goodTemp = false;
         */
        this.condition = condition;
        this.goodTemp = false;
    }

    // methods
    public String toString() {
        return temp + " degrees and " + condition + " today!";
    }

    // accessors (or getters)
    public int getTemp() {
        return temp;
    }

    public int getGoodTemp(){
        return 
    }

    // mutators (or setters)
    public void setTemp(int temp) {
        if (temp >= -40 && temp <= 120) {
            this.temp = temp;
        } else {
            System.out.println("This temperature is too extreme! Do not ride!");
        }
    }

}
