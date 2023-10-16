package com.milliondollawinners;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello world");

        // Date birthday = new Date();
        // System.out.println(birthday.getMonth());

        // Date kensBirthday = new Date(11, 11, 1986);
        // System.out.println(kensBirthday.getMonth());

        // System.out.println(kensBirthday);

        // kensBirthday.setMonth(2);
        // System.out.println(kensBirthday);
        // kensBirthday.setMonth(14);  // should not change month
        // System.out.println(kensBirthday);


        // Location austin = new Location();
        // System.out.println(austin);

        // Location snohomish = new Location(47.919167, -122.09111, "Snohomish");
        // System.out.println(snohomish.getLat());
        // System.out.println(snohomish.getLon());

        // System.out.println(snohomish);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month of your event (1-12): ");
        int month = input.nextInt();
        input.nextLine();

        System.out.print("Enter the day of your event (1-31): ");
        int day = input.nextInt();
        input.nextLine();

        System.out.print("Enter the year of your event (YYYY): ");
        int year = input.nextInt();
        input.nextLine();


        System.out.print("What time (hour) does your event start (0-23): ");
        int hour = input.nextInt();
        input.nextLine();

        System.out.print("What time (minute) does your event start (0-59): ");
        int minute = input.nextInt();
        input.nextLine();

        System.out.print("Enter the name of the event: ");
        String name = input.nextLine();

        Event test = new Event(name, month, day, year, hour, minute);
        System.out.println(test);






    }
}
