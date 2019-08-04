package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        System.out.println("Let's start first task\n");
        task1.task1();
        System.out.println("\nLet's start second task\n");
        task2.task2();
        System.out.println("\nLet's start third task\n");
        task3.task3();

        System.out.println("\nThank You for checking out my HW");
    }
}
