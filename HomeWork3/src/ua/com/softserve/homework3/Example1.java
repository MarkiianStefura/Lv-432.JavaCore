package ua.com.softserve.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {

//                          FIRST EXAMPLE

        float a = -2.8f;
        float b = 8.8f;
        float c = -8.9f;
        float x = 5.0f;
        float y = -5.0f;
        System.out.println("First example:");
        if ((a <= x) & (a >= y)) {
            System.out.println(" True");
        } else {
            System.out.println(" False");
        }
        if ((b <= x) & (b >= y)) {
            System.out.println(" True");
        } else {
            System.out.println(" False");
        }
        if ((c <= x) & (c >= y)) {
            System.out.println(" True");
        } else {
            System.out.println(" False");
        }

//                      SECOND EXAMPLE

        System.out.println("Second example:");
        int i = 6;
        int p = 5;
        int o = 7;

        if ((i > p) && (i > o)) {
            System.out.println(" max = i");
        } else if ((p > i) && (p > o)) {
            System.out.println(" max = p");
        } else if ((o > i && o > p)) {
            System.out.println(" max = o");
        }
        if ((i < p) && (i < o)) {
            System.out.println(" min = i");
        } else if ((p < i) && (p < o)) {
            System.out.println(" min = p");
        } else if ((o < i) && (o < p)) {
            System.out.println(" min = o");
        } else {
            System.out.println(" Two or more numbers are the same!!!");
        }

//                        Third Example

        System.out.println("Enter ERROR number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        switch (input) {
            case 400:
                System.out.println(HttpError.BADREQUEST);
                break;
            case 401:
                System.out.println(HttpError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HttpError.PAYMENTREQUIRED);
            default:
                break;
        }
    }
}

