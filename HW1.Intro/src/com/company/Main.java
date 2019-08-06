package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        task1(bf);
        task2(bf);
        task3(bf);
    }

    private static void task1(BufferedReader bf) throws IOException {
        System.out.print("Radius = ");
        int radius = Integer.parseInt(bf.readLine());

        System.out.println("Perimeter = " + (2 * Math.PI * radius));
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    private static void task2(BufferedReader bf) throws IOException {
        System.out.print("What is your name?");
        String name = bf.readLine();

        System.out.println("Where do you live, " + name + "?");
        String address = bf.readLine();

        System.out.println(name + " lives in " + address);
    }

    private static void task3(BufferedReader bf) throws IOException {
        System.out.print("Call from country c1 costs = ");
        int c1 = Integer.parseInt(bf.readLine());

        System.out.print("Call from country c2 costs = ");
        int c2 = Integer.parseInt(bf.readLine());

        System.out.print("Call from country c3 costs = ");
        int c3 = Integer.parseInt(bf.readLine());

        System.out.print("Talk t1 continued = ");
        int t1 = Integer.parseInt(bf.readLine());

        System.out.print("Talk t2 continued = ");
        int t2 = Integer.parseInt(bf.readLine());

        System.out.print("Talk t3 continued = ");
        int t3 = Integer.parseInt(bf.readLine());

        System.out.println("First call = " + c1 * t1);
        System.out.println("Second call = " + c2 * t2);
        System.out.println("Third call = " + c3 * t3);

        System.out.println("All talks together = " + (c1 * t1 + c2 * t2 + c3 * t3));
    }
}