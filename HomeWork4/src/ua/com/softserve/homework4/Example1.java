package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a = 0;
        System.out.println("Enter the number of month: ");
        a =  Integer.parseInt(br.readLine());
        System.out.println("The month has " + (monthDays[a-1]) + " days;");

    }
}




















