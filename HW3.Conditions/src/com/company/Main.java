package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.Util.*;
public class Main {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        floatNumbersTask(bf);

        intNumbersTask(bf);

        readHTTPErrorCode(bf);

        dogBreedTask(bf);

    }

    /**
     * Read 3 float numbers and check: are they all belong to the range [-5,5]
     * @param bf
     */
    private static void floatNumbersTask(BufferedReader bf) {
        System.out.print("Enter first float number = ");
        float f1 = safeParseFloat(safeReadLine(bf));

        System.out.print("Enter second float number = ");
        float f2 = safeParseFloat(safeReadLine(bf));

        System.out.print("Enter third float number = ");
        float f3 = safeParseFloat(safeReadLine(bf));

        System.out.println("They belong to the range [-5,5]: " +
                checkFloatNumbersRange(f1, f2, f3));
    }

    /**
     * Read 3 integer numbers and write max and min of them
     * @param bf
     */
    private static void intNumbersTask(BufferedReader bf) {
        System.out.print("Enter first int number = ");
        int n1 = safeParseInt(safeReadLine(bf));

        System.out.print("Enter second int number = ");
        int n2 = safeParseInt(safeReadLine(bf));

        System.out.print("Enter third int number = ");
        int n3 = safeParseInt(safeReadLine(bf));

        System.out.println("Max = " + maxNumber(n1, n2, n3));
        System.out.println("Min = " + minNumber(n1, n2, n3));
    }

    /**
     * Read number of HTTP Error (400, 401,402, ...)
     * and write the name of this error \n(Declare enum HTTPError)
     * @param bf
     */
    private static void readHTTPErrorCode(BufferedReader bf) {
        System.out.print("Enter http error code:");
        int code = safeParseInt(safeReadLine(bf));
        System.out.println("Name of this error: " + httpErrorName(code));
    }

    /**
     * Create 3 instances of type Dog.
     * Check if there is no two dogs with the same name.
     * Display the name and the kind of the oldest dog.
     * @param bf
     */
    private static void dogBreedTask(BufferedReader bf) {
        Dog dog1 = new Dog(5, Breed.MIXED_BREED, "Ivan");
        Dog dog2 = new Dog(6, Breed.PEMBROKE_WELSH_CORGI, "Vasya");
        Dog dog3 = new Dog(7, Breed.GERMAN_SHEPHERD, "Kotyk");

        System.out.println("Is there two dogs with the same name: " +
                (Dog.isSameName(dog1,dog2)|| Dog.isSameName(dog2,dog3) || Dog.isSameName(dog1,dog3)));

        System.out.println("Oldest dog: " + Dog.oldestDog(dog1, Dog.oldestDog(dog2,dog3)).toString());
    }
}

