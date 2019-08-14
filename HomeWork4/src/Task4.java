import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car[] cars = new Car[4];
        cars[0] = new Car(1965, 3.5, "Gaz 69");
        cars[1] = new Car(1984, 3.0, "Bobik");
        cars[2] = new Car(1999, 1.6, "Lada 2109");
        cars[3] = new Car(1981, 2.0, "Porche Panamera");

        System.out.println("Enter car year");
        int year = Integer.parseInt(br.readLine());

        modelYear(cars, year);

        sort(cars);
        System.out.println(Arrays.toString(cars));
    }

    private static void modelYear(Car[] cars, int year) {
        for (Car s : cars
        ) {
            if (s.getYearOfProduction() == year) {
                System.out.println(s.toString());
            }
        }

    }

    private static void sort(Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }

        }
    }


}
