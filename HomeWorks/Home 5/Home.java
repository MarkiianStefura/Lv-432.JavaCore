package edu.softserve.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Home {
    public static void main(String[] args) throws IOException {
        int[] amountOfMounth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] arr = new int[10];
        int[] arr2 = new int[5];
        int sum = 0;
        int product = 0;
        int count = 0;
        int product2=1;
        int min;
        int position=0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //
        //First home task
        //Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).

        //int [] amountOfMounth ={31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Please enter your number");
        int userNumber = Integer.parseInt(input.readLine());
        if ((userNumber>=1)&&(userNumber<=amountOfMounth.length)){
            System.out.println("In this mounth are " + (amountOfMounth[userNumber-1])+" days" );
        }
        else System.out.println("wrong input data");


        //
        // Second home task

        //Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.

        //int [] arr = new int[10];
        System.out.println("Please enter 10 integer numbers");
        for(int i= 0; i<arr.length;i++){
            arr[i]=Integer.parseInt(input.readLine());
            System.out.println((i+1)+" Number is " +arr[i]);
            }

        if ( (arr[0] >= 0)&(arr[1] >= 0)&(arr[2] >= 0)&(arr[3] >= 0)&(arr[4] >= 0)) {
                sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
                System.out.println("First 5 elements is positive, so we should get the SUM of them " + sum);
            }
            else {
            product = arr[5] * arr[6] * arr[7] * arr[8] * arr[9];
            System.out.println("The product of last 5 integer is "+ product);
        }


        //
        // Third home task

        //Enter 5 integer numbers. Find
        //position of second positive number;
        //minimum and its position in the array.
        //Organize entering integers until the first negative number. Count the product of all entered even numbers.
        // int [] arr2 = new int[5];

        System.out.println("Please enter 5 integer numbers");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(input.readLine());
        }
        min=arr2[0];
        System.out.println("Thank's for your number");

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%2==0){
                product2*=arr2[i];
            }
            if (arr2[i] >= 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Second positive number is " + arr2[i]);
            }
        }
        System.out.println("Our product is "+ product2);
        for(int x : arr2){
            if(x<min){
                min=x;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(min==arr2[i]){
                position =i;
                break;
            }
        }
        System.out.println("Minimum element is " + min + " and its position in the array is "+position);

        //
        //Organize entering integers until the first negative number. Count the product of all entered even numbers.
        System.out.println("Please enter 5 integer positive numbers");
        for (int i = 0; i < arr2.length; i++) {
            int positiveNumber = Integer.parseInt(input.readLine());
            product2=1;
            if(positiveNumber>0){
                arr2[i]=positiveNumber;
                product2*=positiveNumber;
                if(arr2[0]<=0){
                    System.out.println("Your fisrt element is smallest than 0, so your product = " +1);
                }
            }

            else break;
        }
        System.out.println("Our product is "+ product2);
    }
}

