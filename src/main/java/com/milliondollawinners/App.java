package com.milliondollawinners;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Weather temp = new Weather();
        System.out.println(temp.getTemp());

        // while (!= temp.getGoodTemp()) {
        //     System.out.print("Please enter a new temperature: ");
        //     temp.setTemp(in.nextInt());
        //     System.out.println(temp.getTemp());
        // }
    }
}
