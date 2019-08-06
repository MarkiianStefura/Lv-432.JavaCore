package HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double c1;
		double c2;
		double c3;
		double t1;
		double t2;
		double t3;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("c1...");
		c1 = Double.parseDouble(reader.readLine());
		System.out.println("t1...");
		t1 = Double.parseDouble(reader.readLine());
		System.out.println("c2...");
		c2 = Double.parseDouble(reader.readLine());
		System.out.println("t2...");
		t2 = Double.parseDouble(reader.readLine());
		System.out.println("c3...");
		c3 = Double.parseDouble(reader.readLine());
		System.out.println("t3...");
		t3 = Double.parseDouble(reader.readLine());
		System.out.println("c1*t1... "+c1*t1);
		System.out.println("c2*t2... "+c2*t2);
		System.out.println("c3*t3... "+c3*t3);
		System.out.println("together... "+((c1*t1)+(c2*t2)+(c3*t3)));
	}

}
