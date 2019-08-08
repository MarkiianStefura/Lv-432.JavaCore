package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        task1(bf);
        task2(bf);
        task3(bf);
    }

    private static void task1(BufferedReader bf) {
        System.out.print("Radius = ");
        int radius = parseIntSafe(readLineSafe(bf));

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }


    private static void task2(BufferedReader bf) {
        System.out.print("What is your name?");
        String name = readLineSafe(bf);

        System.out.println("Where do you live, " + name + "?");
        String address = readLineSafe(bf);

        System.out.println(name + " lives in " + address);
    }

    private static void task3(BufferedReader bf)  {
        System.out.print("Call from country c1 costs = ");
        int c1 = parseIntSafe(readLineSafe(bf));

        System.out.print("Call from country c2 costs = ");
        int c2 = parseIntSafe(readLineSafe(bf));

        System.out.print("Call from country c3 costs = ");
        int c3 = parseIntSafe(readLineSafe(bf));

        System.out.print("Talk t1 continued = ");
        int t1 = parseIntSafe(readLineSafe(bf));

        System.out.print("Talk t2 continued = ");
        int t2 = parseIntSafe(readLineSafe(bf));

        System.out.print("Talk t3 continued = ");
        int t3 = parseIntSafe(readLineSafe(bf));

        System.out.println("First call = " + c1 * t1);
        System.out.println("Second call = " + c2 * t2);
        System.out.println("Third call = " + c3 * t3);

        System.out.println("All talks together = " + (c1 * t1 + c2 * t2 + c3 * t3));
    }


    private static String readLineSafe(BufferedReader bf) {
        String result = "";
        try {
            result = bf.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    private static int parseIntSafe(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}