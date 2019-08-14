package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM3 {

        public static void main (String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int c1 = 5;
            int c2 = 8;

            System.out.println("Where you colled?");
            String country1 = br.readLine();
            System.out.println("How long did you tolk?");

            float c3 = 2.5f;           int cost1 = Integer.parseInt(br.readLine());
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
            System.out.println("You did to " + country3 + " you coll is cost " + c3*cost3);

            int sum1 = c1*cost1;
            int sum2 = c2*cost2;
            double sum3 = c3*cost3;

            System.out.println("All colls cost " + (sum1+sum2+sum3));



        }
    }

