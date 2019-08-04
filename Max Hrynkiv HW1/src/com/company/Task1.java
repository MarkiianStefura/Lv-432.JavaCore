package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void task1() throws IOException {
        final float PI = 3.14f;
        System.out.println("Write radius");
        BufferedReader writeRadius = new BufferedReader(new InputStreamReader(System.in));
        float radius = Float.parseFloat(writeRadius.readLine());
        System.out.println("Perimeter is " + (radius * 2 * 3.14));
        System.out.println("Area is " + (radius * radius * PI));
    }
}