package com.milliondollawinners;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What's the name of your event? ");
        String eventName = input.nextLine();

    }
}
