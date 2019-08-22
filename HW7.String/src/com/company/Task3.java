package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "(\\$\\d+\\.+\\d{1,2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m;

        System.out.println("Enter some amount of money and its currency");
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            m = p.matcher(input[i]);
            System.out.println(m.find() + " " + input[i]);
        }

    }
}
