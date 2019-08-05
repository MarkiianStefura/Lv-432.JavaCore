package taskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of r ");
		double r=Double.parseDouble(bf.readLine());
		double area=Math.PI*Math.pow(r, 2);
		System.out.println("Circle area " + area);
		
		double perimeter = 2 * Math.PI * r;
		System.out.println("Circle perimyr "+ perimeter);

	}

}
