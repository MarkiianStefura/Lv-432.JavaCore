package PracticalTask5;


public class ArrayTask5 {

	public static void main(String[] args) {
		int[] arr = {10, -21, 52, 4, 85, -42, -7, 17, 13, -18};
		//the biggest of these numbers;
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}		
		System.out.println(max);
		//the sum of positive numbers in the array;
		int sumPositive = 0;
		for (int i : arr) {
			if (i > 0) {
				sumPositive = sumPositive + i;
			}
		}
		System.out.println(sumPositive);
		//the amount of negative numbers in the array.
		int amountOfNegative = 0;
		int amountOfPositive = 0;
		for (int i : arr) {
			if (i < 0) {
				amountOfNegative++;
			}if (i > 0) {
				amountOfPositive++;
			}
		}
		System.out.println("Neggative = "+amountOfNegative+
				" Positive = "+amountOfPositive);
		//What values there are more: negative or positive?
		if (amountOfPositive > amountOfNegative) {
			System.out.println("Here values are more positive");
		}if (amountOfPositive < amountOfNegative) {
			System.out.println("Here values are more negative");
		}
	}

}
