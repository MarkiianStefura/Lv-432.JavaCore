package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ReadThreeFloats(br);
        Task2.readThreeInts(br);
        Task3.httpErrors(br);

        Dog tuzik = new Dog("tuzik",Breed.CORGI,8);
        Dog kiki = new Dog("kiki",Breed.MOPS,2);
        Dog luchador = new Dog("luchador",Breed.BASTARDO,15);


        System.out.println("Check dogs name " + (Dog.equalName(tuzik,kiki)|| Dog.equalName(kiki,luchador) || Dog.equalName(luchador,tuzik)));

        System.out.println("Older dog is " + (Dog.older(tuzik,Dog.older(kiki,luchador))));




    }

    private static void ReadThreeFloats(BufferedReader bufferedReader) throws IOException {
        System.out.print("Enter first float number");
        float NumberOne = Float.parseFloat(bufferedReader.readLine());
        System.out.print("Enter second float number");
        float NumberTwo = Float.parseFloat(bufferedReader.readLine());
        System.out.print("Enter thirst float number");
        float NumberThree = Float.parseFloat(bufferedReader.readLine());
        System.out.println("are they all belong to the range [-5,5]" + CheckThree(NumberOne, NumberTwo, NumberThree));

    }

    public static boolean CheckThree(float number1, float number2, float number3) {
        return CheckRange(number1) && CheckRange(number2) && CheckRange(number3);


    }

    public static boolean CheckRange(float kiki) {
        return kiki >= -5 && kiki <= 5;


    }


}
