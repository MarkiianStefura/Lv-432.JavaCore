package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter sentence : ");
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().replaceAll("\\s+", " ").trim();

        System.out.println(sentence);

    }

}
