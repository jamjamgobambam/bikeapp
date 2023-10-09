package com.milliondollawinners;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Date birthday = new Date();
        System.out.println(birthday.getMonth());

        Date kensBirthday = new Date(11, 11, 1986);
        System.out.println(kensBirthday.getMonth());

        System.out.println(kensBirthday);

        kensBirthday.setMonth(2);
        System.out.println(kensBirthday);
        kensBirthday.setMonth(14);  // should not change month
        System.out.println(kensBirthday);

    }
}
