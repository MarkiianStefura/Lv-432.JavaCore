package ua.ivanskyi.hw1;

public class PhoneCalls {

	public static int costCalculation(int c, int t) {
		int result = c * t;

		return result;

	}

	public static void main(String[] args) {

		int c1 = 5;
		int c2 = 8;
		int c3 = 10;

		int t1 = 3;
		int t2 = 7;
		int t3 = 6;

		System.out.println("cost of a call = " + costCalculation(c1, t1));
		System.out.println("cost of a call = " + costCalculation(c2, t2));
		System.out.println("cost of a call = " + costCalculation(c3, t3));
		System.out.println(
				"cost of all calls = " + (costCalculation(c3, t3) + costCalculation(c2, t2) + costCalculation(c3, t3)));

	}

}
