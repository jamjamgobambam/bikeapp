package com.milliondollawinners;

public class App {
    public static void main(String[] args) {
        Weather weather1 = new Weather();
        Weather weather2 = new Weather(140, "cloudy");

        System.out.println(weather1);
        System.out.println(weather2);

        weather1.setTemp();
    }
}
