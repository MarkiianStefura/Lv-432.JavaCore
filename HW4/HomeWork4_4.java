import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car car1 = new Car("Hatchback", 2018, 5.4f);
		Car car2 = new Car("Sedan", 2015, 5.9f);
		Car car3 = new Car("Crossover", 2016, 6.5f);
		Car car4 = new Car("Sportcar", 2019, 7.0f);
		
		Car[] allCar = {car1, car2, car3, car4};
		Car tmp;

		for (int i = 0; i < allCar.length - 1; i++) {
			
				for (int j = i + 1; j < allCar.length; j++) {
					if (allCar[i].getYear() < allCar[j].getYear()) {
						tmp = allCar[i];
						allCar[i] = allCar[j];
						allCar[j] = tmp;
				}
			}
		}
		for(Car g : allCar) {
			g.carInfo();
		}
	}
}
