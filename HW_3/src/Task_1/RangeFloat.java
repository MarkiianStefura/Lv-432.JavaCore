package Task_1;

import java.io.BufferedReader;

public class RangeFloat {
	private static int count = 0;

	public void inputNumbers(BufferedReader bf) throws Exception {
		System.out.println("Enter number float type ");
		float f1 = Float.parseFloat(bf.readLine());
		System.out.println("Enter number float type ");
		float f2 = Float.parseFloat(bf.readLine());
		System.out.println("Enter number float type ");
		float f3 = Float.parseFloat(bf.readLine());

		if ((f1 <= 5) && (f1 >= -5)) {
			count++;
			System.out.println(f1 + " belong to the range[-5,5]");
		}
		if ((f2 <= 5) && (f2 >= -5)) {
			count++;
			System.out.println(f2 + " belong to the range[-5,5]");
		}
		if ((f3 <= 5) && (f3 >= -5)) {
			count++;
			System.out.println(f3 + " belong to the range[-5,5]");
		}
		System.out.println("You enter " + count + " numbers from range [-5,5] ");

	}

}
