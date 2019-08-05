package taskThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double c1, c2, c3;
		double t1, t2, t3;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value c1 ");
		c1 = Integer.parseInt(bf.readLine());
		System.out.println(" Enter value t1");
		t1 = Double.parseDouble(bf.readLine());
		double count = c1 * t1;
		System.out.println("Count of call " + count);
		
		System.out.println("Enter value c2 ");
		c2 = Integer.parseInt(bf.readLine());
		System.out.println(" Enter value t2");
		t2 = Double.parseDouble(bf.readLine());
		double count2 = c2 * t2;
		System.out.println("Count of call " + count2);
		
		System.out.println("Enter value c3 ");
		c3 = Integer.parseInt(bf.readLine());
		System.out.println(" Enter value t3");
		t3 = Double.parseDouble(bf.readLine());
		double count3 = c3 * t3;
		System.out.println("Count of call " + count3);
		
		double allCounts=count + count2+ count3;
		System.out.println("All counts of calls " + allCounts);
		
	}

}
