package com.company;

import java.io.BufferedReader;
import java.util.Arrays;

import static com.company.Util.*;

public class Tasks {
    public static void task1(BufferedReader bf) {
        System.out.println("Enter year : ");
        int year = safeParseInt(safeReadLine(bf));

        System.out.println("Century " + (year + 99) / 100);
    }

    public static void task2() {
        double[] sequence = new double[20];
        sequence[0] = 0;
        sequence[1] = 5 / 8.0;
        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = (sequence[i - 1] / 2) + (3 / 4.0) * sequence[i - 2];
        }

        System.out.println(Arrays.toString(sequence));
    }

    public static void task3() {
        double result = 0;
        for (int i = 1; i <= 30; i++) {
            result += (getA(i) - getB(i)) * (getA(i) - getB(i));
        }

        System.out.println("Result : " + result);
    }

    private static double getA(int i) {
        return i % 2 == 0 ? i / 2.0 : i;
    }

    private static double getB(int i) {
        return i / 10.0 - i;
    }

    public static void task4(BufferedReader bf) {
        System.out.print("Enter number of elements in sequence : ");
        int n = safeParseInt(safeReadLine(bf));
        double[] sequence = new double[n];
        double element;
        for (int i = 0; i < sequence.length; i++) {
            System.out.print("Enter a" + i + " = ");
            element = safeParseDouble(safeReadLine(bf));
            if (i == 0) {
                sequence[i] = Math.abs(element);
                continue;
            }
            sequence[i] = Math.abs(sequence[i - 1] + element);

        }

        System.out.println(Arrays.toString(sequence));
    }

    public static void task5(BufferedReader bf) {
        System.out.println("Enter sides of triangle :");
        System.out.print(" a = ");
        double a = safeParseDouble(safeReadLine(bf));

        System.out.print(" b = ");
        double b = safeParseDouble(safeReadLine(bf));

        System.out.print(" c = ");
        double c = safeParseDouble(safeReadLine(bf));

        if (isCorrectTriangleSides(a, b, c)) {
            if (isEquilateral(a, b, c)) {
                System.out.println(3);
            } else if (isEqualSide(a, b, c)) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }
    }

    private static boolean isCorrectTriangleSides(double a, double b, double c) {
        return (a + b) >= c;
    }

    private static boolean isEquilateral(double a, double b, double c) {
        return a == b && b == c;
    }

    private static boolean isEqualSide(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    public static void task6(BufferedReader bf) {
        int n = 0;
        int[] arrayOfA = new int[4];
        System.out.println("Enter " + arrayOfA.length + " numbers\n" +
                "1 should be different, rest " + (arrayOfA.length - 1) +
                " are the same.");

        for (int i = 0; i < arrayOfA.length; i++) {
            System.out.print("a[" + i + "] = ");
            arrayOfA[i] = safeParseInt(safeReadLine(bf));
        }

        for (int i = 0; i < arrayOfA.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayOfA.length; j++) {
                if ((arrayOfA[i] == arrayOfA[j]) && (i != j)) {
                    count++;
                }
            }
            if (count == 0) {
                n = i;
            }
        }
        System.out.println("Index of unique number : " + n);

    }

    public static void task7(BufferedReader bf) {
        System.out.print("Enter k = ");
        int k = safeParseInt(safeReadLine(bf));
        int[] array = new int[180];
        int current = 10;

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(current);
            array[i] = current / 10;
            array[i + 1] = current % 10;
            current++;
        }
        System.out.println("\nAnswer " + array[k]);

    }


    public static void task8(BufferedReader bf) {
        System.out.print("Enter a = ");
        double a = safeParseDouble(safeReadLine(bf));

        System.out.print("Enter b = ");
        double b = safeParseDouble(safeReadLine(bf));

        System.out.println("c = " + gcd(a, b));
    }

    private static double gcd(double a, double b) {
        double t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void task9() {
        int n = 40;
        double y = n;
        while (n > 0) {
            y = (n - 1) + Math.cos(y);
            n--;
        }
        System.out.println("y = " + y);
    }

    public static void task10(BufferedReader bf) {
        System.out.print("Enter radius : ");
        double r = safeParseDouble(safeReadLine(bf));

        System.out.print("Enter n : ");
        int n = safeParseInt(safeReadLine(bf));

        double[] arrayOfA = new double[n];
        for (int i = 0; i < arrayOfA.length; i++) {
            System.out.print("Enter a[" + i + "]=");
            arrayOfA[i] = safeParseDouble(safeReadLine(bf));
        }

        int count = 0;
        for (int i = 0; i < arrayOfA.length; i++) {
            for (int j = 0; j < arrayOfA.length; j++) {
                if (Math.sqrt(arrayOfA[i] * arrayOfA[i] + arrayOfA[j] * arrayOfA[j]) <= r) {
                    count++;
                }
            }
        }
        System.out.println("Number of points inside of circle with radius " + r + " is " + count);
    }


    public static void task11(BufferedReader bf) {
        System.out.print("Enter number of customers : ");
        int n = safeParseInt(safeReadLine(bf));

        double t = 0;

        double[] timeInQueue = new double[n];

        for (int i = 0; i < timeInQueue.length; i++) {
            if (i != 0) {
                timeInQueue[i] += timeInQueue[i - 1] + t;
            }
            System.out.print("Enter service time of " + (i + 1) + "" +
                    " customer : ");
            t = safeParseDouble(safeReadLine(bf));

        }
        System.out.println(Arrays.toString(timeInQueue));
    }

    public static void task12(BufferedReader bf) {
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

        System.out.print("Enter number of marks : ");
        int numberMarks = safeParseInt(safeReadLine(bf));

        double[] marks = new double[numberMarks];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark[" + (i + 1) + "] = ");
            marks[i] = safeParseDouble(safeReadLine(bf));
            if (max < marks[i]) {
                max = marks[i];
            }
            if (min > marks[i]) {
                min = marks[i];
            }
            sum += marks[i];

        }
        System.out.println(Arrays.toString(marks));
        sum -= max;
        sum -= min;

        System.out.println("Total mark : " + sum / (marks.length - 2));
    }
}
