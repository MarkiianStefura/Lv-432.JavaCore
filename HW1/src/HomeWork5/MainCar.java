package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car car1 = new Car(2010, 1300);
		Car car2 = new Car(2012, 1500);
		Car car3 = new Car(2015, 2000);
		Car car4 = new Car(2018, 3200);
		Car[] cars = {car1, car2, car3, car4};
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please year of production ...");
		int year = Integer.parseInt(reader.readLine());
		for (int i = 0; i < cars.length; i++) {
			if (year == cars[i].getYearOfProduction()) {
				System.out.println(cars[i].toString());
			}
		}
		
		
		
	}

}
