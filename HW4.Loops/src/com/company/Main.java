package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import static com.company.Task1.writeDaysInMonth;
import static com.company.Task2.enterTenInts;
import static com.company.Task3.enterFiveInts;
import static com.company.Task4.displayCars;

public class Main {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        writeDaysInMonth(bf);

        enterTenInts(bf);

        enterFiveInts(bf);

        displayCars(bf);

    }






}
