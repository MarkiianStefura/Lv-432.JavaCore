package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int product1 = 1;
        int[] arrayList = new int[5];
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println("Input " + (i + 1) + " number");
            arrayList[i] = Integer.parseInt(br.readLine());

            if (arrayList[i] < 0) {
                System.out.println("Entered  a negative number!");
                break;
            }
            if (arrayList[i] % 2 == 0) {
                product1 *= arrayList[i];  // Добуток, а потрібно кількість парних
                continue;
            }
        }
        if (product1 != 1) {

            System.out.println("The product of even numbers = " + product1);
            System.out.println("The end!!!");
        }
    }
}
