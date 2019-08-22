package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayNumbers = new int[5];
        int positionOfNumber= 0;
        int min = Integer.MAX_VALUE;
        int secondPositive = -1;

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Input " + (i + 1) + " number");
            arrayNumbers[i] = Integer.parseInt(br.readLine());
            if(arrayNumbers[i]<min){
                min = arrayNumbers[i];
                positionOfNumber = i;
            }
        }
        System.out.println("Min = " + min + " it is position = " + positionOfNumber);

        boolean secondPositivefound = false;
        int[] array = new int[] {-2, 3, 3, -5, 8};
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                for (int s = i + 1; s < array.length ; s++ ) {  //  Вкрай нераціонально
                    if (array[s] > 0) {
                        secondPositive = s;
                        secondPositivefound = true;
                        break;
                    }
                }
            }
            if (secondPositivefound) {
                break;
            }
        }
        System.out.println("Second positive number is  " + secondPositive);
    }
}
