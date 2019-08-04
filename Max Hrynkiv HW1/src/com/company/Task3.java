package com.company;

import java.util.Scanner;

public class Task3 {

    public static void task3() {

        System.out.println("Write cost for countries");
        Scanner reader = new Scanner(System.in);
        int c1 = reader.nextInt();
        int c2 = reader.nextInt();
        int c3 = reader.nextInt();

        System.out.println("Write amount of minutes for countries");
        int t1 = reader.nextInt();
        int t2 = reader.nextInt();
        int t3 = reader.nextInt();

        System.out.println("Fitst call: " + calculation(c1, t1) + "\nSecond call: " + calculation(c2, t2) + "\nThird call: " + calculation(c3, t3));
        System.out.println("All calls: " + (calculation(c1, t1) + calculation(c2, t2) + calculation(c3, t3)));

    }
    static int calculation (int unitsPerMinute, int minutes){
        int result = unitsPerMinute * minutes;
        return result;
    }
}
