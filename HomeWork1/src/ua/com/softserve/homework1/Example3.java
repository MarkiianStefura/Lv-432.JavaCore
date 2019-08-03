package ua.com.softserve.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c1 = 2;
        int c2 = 3;
        int c3 = 4;

        System.out.println("From which country is the first call?");
        String name = br.readLine();
        System.out.println("How many minutes from " + name + "?");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Call from " + name + ": " + c1*t1 + " dol;");


        System.out.println("From which country is the first call?");
        String name2 = br.readLine();
        System.out.println("How many minutes from " + name2 + "?");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Call from " + name2 + ": "+ c2*t2 + " dol;");

        System.out.println("From which country is the first call?");
        String name3 = br.readLine();
        System.out.println("How many minutes from " + name3 + "?");
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("Call from " + name3 + ": " + c3*t3 + " dol;");

        System.out.println();

        System.out.println("The sum of all calls: " + ((c1*t1)+(c2*t2)+(c3*t3)) + " dol");

    }
}
