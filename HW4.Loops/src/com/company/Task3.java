package com.company;

import java.io.BufferedReader;

import static com.company.Util.*;

public class Task3 {
    public static void enterFiveInts(BufferedReader bf) {
        int[] inputArray = new int[5];
        int input;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter " + (i + 1) + " int: ");
            input = safeParseInt(safeReadLine(bf));
            if (input < 0) {
                break;
            }
            inputArray[i] = input;
        }

        System.out.println("Second positive number position : " + secondPositiveNumberPosition(inputArray));

        minimumAndItsPosition(inputArray);

        System.out.println("Product of even numbers in array : " + arrayEvenNumbersProduct(inputArray));
    }

    private static int secondPositiveNumberPosition(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                num++;
            }
            if (num > 1) {
                return i;
            }
        }
        return -1;
    }

    private static void minimumAndItsPosition(int[] array) {
        int min = array[0];
        int pos = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }

        System.out.println("minimum array[" + pos + "] = " + min);
    }

    private static int arrayEvenNumbersProduct(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result *= array[i];
            }
        }
        return result;
    }
}
