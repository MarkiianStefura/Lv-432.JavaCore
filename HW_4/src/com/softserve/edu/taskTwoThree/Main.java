package com.softserve.edu.taskTwoThree;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		ArraysOfInteger a = new ArraysOfInteger();
		a.arraysSumProduct();
		a.position();
		a.minValue();
	a.enterNumber(bf);

	}

}
