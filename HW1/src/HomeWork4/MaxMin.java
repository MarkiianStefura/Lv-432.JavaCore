package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		c = Integer.parseInt(reader.readLine());
		int min;
		int max;
		max = max(a, b);
		max = max(max, c);
		min = min(a, b);
		min = min(min, c);		
		System.out.println("MIN = "+min+ " MAX =  "+max);

	}
	public static int max(int x, int y) {
		if (x >= y) {
			return x;
		}else  {
			return y;
		}
		
	}
	public static int min(int x, int y) {
		if (x <= y) {
			return x;
		}else  {
			return y;
		}
		
	}
}
