package Task_1;

import java.io.BufferedReader;

public class MinMax {
	public void inputNumbers(BufferedReader bf) throws Exception {
		System.out.println("Enter number int type ");
		int i1 = Integer.parseInt(bf.readLine());
		System.out.println("Enter number int type ");
		int i2 = Integer.parseInt(bf.readLine());
		System.out.println("Enter number int type ");
		int i3 = Integer.parseInt(bf.readLine());

		if ((i1 > i2) && (i1 > i3)) {
			System.out.println(i1 + " It'm MAX value");
		}
		if ((i2 > i1) && (i2 > i3)) {
			System.out.println(i2 + " It'm MAX value");
		}

		if ((i3 > i1) && (i3 > i2)) {
			System.out.println(i3 + " It'm MAX value");
		}

		if ((i1 < i2) && (i1 < i3)) {
			System.out.println(i1 + " It's MIN value");
		}
		if ((i2 < i1) && (i2 < i3)) {
			System.out.println(i2 + " It's MIN value");
		}

		if ((i3 < i1) && (i3 < i2)) {
			System.out.println(i3 + " It's MIN value");
		}
	}

}
