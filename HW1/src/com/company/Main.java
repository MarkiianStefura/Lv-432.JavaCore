package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        task1();
        task2();
        task3();
    }

    private static void task1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Radius = ");
        int radius = Integer.parseInt(bf.readLine());

        System.out.println("Perimeter = " + (2 * Math.PI * radius));
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    private static void task2() throws IOException {
        String name;
        String address;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Whats is your name?");
        name = bf.readLine();

        System.out.println("Where are you live, " + name + "?");
        address = bf.readLine();

        System.out.println(name + " lives in " + address);
    }

    private static void task3() throws IOException {
        int c1;
        int c2;
        int c3;
        int t1;
        int t2;
        int t3;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Call from country c1 costs = ");
        c1 = Integer.parseInt(bf.readLine());

        System.out.println("Call from country c2 costs = ");
        c2 = Integer.parseInt(bf.readLine());

        System.out.println("Call from country c3 costs = ");
        c3 = Integer.parseInt(bf.readLine());

        System.out.println("Talk t1 continued = ");
        t1 = Integer.parseInt(bf.readLine());

        System.out.println("Talk t2 continued = ");
        t2 = Integer.parseInt(bf.readLine());

        System.out.println("Talk t3 continued = ");
        t3 = Integer.parseInt(bf.readLine());

        System.out.println("First call = " + c1 * t1);
        System.out.println("Second call = " + c2 * t2);
        System.out.println("Third call = " + c3 * t3);

        System.out.println("All talks together = " + (c1 * t1 + c2 * t2 + c3 * t3));
    }
}
