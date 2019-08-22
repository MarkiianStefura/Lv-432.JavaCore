package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input " + (i + 1) + " number:");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int resault = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] > 0) {
                resault = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];  // Такий код архітектурно неправильний, а якщо кількість буде змінюватися
            } else {
                for (int j = 5; i < numbers.length; i++) {
                    resault = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
                }
            }
            System.out.println(resault);
        }
    }
}


