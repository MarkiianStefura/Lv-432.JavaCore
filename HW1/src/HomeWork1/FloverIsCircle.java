package HomeWork1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloverIsCircle {
	

	public static void main(String[] args) throws NumberFormatException, IOException {		
		double area;
		double radius;
		double perimeter;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the radius of the circle:");
		radius = Double.parseDouble(reader.readLine());
		area = Math.PI * Math.pow(radius, 2);
		perimeter = 2*Math.PI*radius;
		System.out.println("the area of the circle is equal " +area);
		System.out.println("the perimeter of the circle is equal " +perimeter);
			

	}

}
