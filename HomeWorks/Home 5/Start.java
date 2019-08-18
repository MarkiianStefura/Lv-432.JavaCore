package edu.softserve.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String []args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Car [] cars = new Car[4];
        cars[0]=new Car("liftbag",2.0);
        cars[1]=new Car("sedan",2.5);
        cars[2]=new Car("crossover",4.4);
        cars[3]=new Car("coupe",3.2);

       for(Car q :cars){
           System.out.println("Please, enter the year of car production ");
           q.setYearOfProduction(Integer.parseInt(bf.readLine()));
       }

       System.out.println("Unsorted values ");
       for(Car q :cars) {
           System.out.println( q.toString());
       }

        System.out.println("Sorted values ");
        Car value;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    value = cars[i];
                    cars[i] = cars[j];
                    cars[j] = value;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }




    }
}
