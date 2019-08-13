package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {



    public static void readThreeInts (BufferedReader bufferedReader)throws IOException {
        System.out.print("Enter first int number");
        int numberOne = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter second int number");
        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter thirst int number");
        int numberThree = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Bigest from three number " + Math.max(numberOne,Math.max(numberTwo,numberThree)));
        System.out.println("Lower from three number " + Math.min(numberOne,Math.min(numberTwo,numberThree)));


    }


}
