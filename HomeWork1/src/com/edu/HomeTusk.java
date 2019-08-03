package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTusk {
    public static void main(String[]args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        double Pi = 3.14;
        System.out.println("Whot is circle radius?");
        int radius = Integer.parseInt(br.readLine());
        System.out.println("Flower bad perimetr is " + 2 * Pi * radius );
        }


    }

class HomeTusk2 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live " + name + "?");
        String adress = br.readLine();
        System.out.println("Your name is " + name + ", and you live in "+ adress);
    }
}


class HomeTusk3 {
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c1 = 5;
        int c2 = 8;
        float c3 = 2.5f;

        System.out.println("Where you colled?");
        String country1 = br.readLine();
        System.out.println("How long did you tolk?");
        int cost1 = Integer.parseInt(br.readLine());
        System.out.println("You did to " + country1 + " you coll is cost " + c1*cost1 );

        System.out.println("Where you colled?");
        String country2 = br.readLine();
        System.out.println("How long did you tolk?");
        int cost2 = Integer.parseInt(br.readLine());
        System.out.println("You did to " + country2 + " you coll is cost " + c2*cost2 );


        System.out.println("Where you colled?");
        String country3 = br.readLine();
        System.out.println("How long did you tolk?");
        int cost3 = Integer.parseInt(br.readLine());
        System.out.println("You did to " + country3 + " you coll is cost " + c3*cost3 );



    }
}