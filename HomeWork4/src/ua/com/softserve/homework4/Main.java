package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car[] arrayCars = new Car[]{
                new Car("Renault","Universal", 2013, 110),
                new Car("Audi","Coupe", 2002, 250),
                new Car("Dodge","Pickup", 2006, 200),
                new Car("BMW","Sedan", 2010, 150),
        };

        System.out.println("Enter the year the of car (2002/2006/2010/2013) : " );
        int carYear =  Integer.parseInt(br.readLine());

        switch (carYear){
            case 2013:
                System.out.println(arrayCars[0]);
                break;
            case 2002:
                System.out.println(arrayCars[1]);
                break;
            case 2006:
                System.out.println(arrayCars[2]);
                break;
            case 2010:
                System.out.println(arrayCars[3]);
                break;
            default:
                System.out.println("There is no car with such a year of production!!!");
        }
        Car tmp;
        boolean isStop = true;
        for (int i = 0; i < arrayCars.length; i++) {
            isStop = true;
            for (int j = 0; j < arrayCars.length - 1 - i; j++) {
                if (arrayCars[j].getYearOfProduct() > arrayCars[j + 1].getYearOfProduct()) {
                    tmp = arrayCars[j];
                    arrayCars[j] = arrayCars[j + 1];
                    arrayCars[j + 1] = tmp;
                    isStop = false;
                }
            }
            if (isStop) {
                break;
            }
        }
        System.out.println("Sorted by the field year: ");
        for (int i = 0; i < arrayCars.length; i++) {
            System.out.println((i + 1) + ".  " + arrayCars[i].name + "  " + arrayCars[i].yearOfProduct + "  ");
        }
    }
}