package com.milliondollawinners;
import java.util.Scanner;

public class Weather {
    // instance variables
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
        
         if (temp >= -40 && temp <= 120) {
         this.goodTemp = true;
         } else this.goodTemp = false;
        
        this.condition = condition;
    }

    // methods
    public String toString() {
        
        if (goodTemp == true) {
            return temp + " degrees and " + condition + " today! \nIt's a great day to ride!";
        } else {
        return temp + " degrees and " + condition + " today! \nThe weather is too extreme to ride!";
        }
    }

    // accessors (or getters)
    public int getTemp() {
        return temp;
    }

    public boolean getGoodTemp(){
        return goodTemp;
    }

    // mutators (or setters)
    public void setTemp() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the new temperature? ");
        int tempTemp = input.nextInt();
        if (tempTemp >= -40 && tempTemp <= 120) {
            temp = tempTemp;
            goodTemp = true;
        } else {
            System.out.println("This temperature is too extreme! Do not ride!");
            goodTemp = false;
        }
        input.close();
    }
    

}