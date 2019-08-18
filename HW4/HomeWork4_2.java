import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] num = { 5, -3, 1, 8, 1, 2, 2, -2, 2, 2 };
		boolean isNegative = true;
		int sum = 0;
		int product = 1;

		for (int x : num) {
			if (x < 0) {
				isNegative = false;
			}
		}

		if (isNegative == true) {
			for (int i = 0; i < num.length / 2; i++) {
				sum += num[i];
			}
			System.out.println("sum = " + sum);
		} else {
			for (int k = (num.length/2); k < num.length; k++) {
				product *= num[k];
			}
			System.out.println("product = " + product);
		}
	}
}
