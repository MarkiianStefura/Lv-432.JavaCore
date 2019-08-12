package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float a;
		float b;
		float c;
		a = Float.parseFloat(reader.readLine());
		b = Float.parseFloat(reader.readLine());
		c = Float.parseFloat(reader.readLine());
		System.out.println(range(a, b)+" "+ (a-b));
		System.out.println(range(a, c)+" "+ (a-c));
		System.out.println(range(b, c)+" "+ (b-c));
		
	}
	public static boolean range(float y, float x) {
		if(y-x > 5.5 || y-x <(-5.5)){
			return false;
		}
		return true;
		
	}
}
