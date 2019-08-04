package com.company;

import java.util.Scanner;

public class Task2 {

    public static void task2() {
        String name;
        String address;

        System.out.println("What is Your name?");

        Scanner reader = new Scanner(System.in);
        name = reader.nextLine();

        System.out.println("Where do You live, " + name);

        address = reader.nextLine();

        System.out.println("Your name is " + name + ".\n" + "You live in " + address + ".");
    }
}