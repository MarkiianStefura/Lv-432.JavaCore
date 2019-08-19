package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw5main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Ask user to enter the number of month. Read the value 
		// and write the amount of days in this month 
		//(create array with amount days of each month).
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfMonth;
		int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("Please number of month...");
		numberOfMonth = Integer.parseInt(reader.readLine());
		System.out.println("Amount days of the month are "+daysOfMonth[numberOfMonth-1]);

		//Enter 10 integer numbers. 
		//Calculate the sum of first 5 elements if they are positive or 
		//product of last 5 element in the other case.
		int[] tenNumbers  = new int[10];
		int counter = 0;
		while (counter <10) {
			tenNumbers[counter] = Integer.parseInt(reader.readLine());
			counter++;
		}
		for (int i : tenNumbers) {
			System.out.print("["+i+"], ");
		}
		int sum5PositiveNumbers = 0;
		int counter5PositiveNumbers = 0;
		for (int i : tenNumbers) {
			if (i > 0) {
				sum5PositiveNumbers = sum5PositiveNumbers +i;
				counter5PositiveNumbers++;
			}if (counter5PositiveNumbers == 5) {
				System.out.println("sum of posutive first 5 elements = "+sum5PositiveNumbers);
				break;
			}
		}
		if(counter5PositiveNumbers < 5) {
			System.out.println("no 5 positive elements");
		}

		//Enter 5 integer numbers. Find 
		//position of second positive number;
		//minimum and its position in the array.
		int[] fiveIntNumbers = {1, -2, 4, 5,-3};
		int position2PN = 0;
		for (int i = 0; i < fiveIntNumbers.length; i++) {
			if(fiveIntNumbers[i]>0) {
				position2PN++;
			}if (position2PN == 2) {
				System.out.println("position of second positive number is "+(i+1));
			}
		}
		int minimum = Integer.MAX_VALUE;
		for (int i : fiveIntNumbers) {
			if (i < minimum) {
				minimum = i;				
			}
		}
		System.out.println("minimum = "+minimum);
		for (int i = 0; i < fiveIntNumbers.length; i++) {
			if (minimum == fiveIntNumbers[i]) {
				System.out.println("minimum position in the array = "+i);
			}
		}
		//Organize entering integers until the first negative number. 
		//Count the product of all entered even numbers.
		int sumEnteredN = 0;
		int i = 0;
		System.out.println("Please int number...");
		while (i >= 0) {
			i = Integer.parseInt(reader.readLine());
			if (i > 0 && i%2==0) {
				sumEnteredN = sumEnteredN + i;
			}
		}
		System.out.println("The sum of all even numbers = "+sumEnteredN);
	}

}
