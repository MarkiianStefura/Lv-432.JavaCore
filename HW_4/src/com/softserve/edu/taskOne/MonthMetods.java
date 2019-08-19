package com.softserve.edu.taskOne;

import java.io.BufferedReader;
import java.io.IOException;

public class MonthMetods {
	Month month;

	public void returnMonth(BufferedReader bf) throws IOException {

		System.out.println("Enter number of month");
		int n = Integer.parseInt(bf.readLine());
		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Repeat the same number ");
		int i = Integer.parseInt(bf.readLine()) - 1;
	   switch (n) {
		case 1:
			System.out.println("You enter number " + n + " month " + month.January + " has " + monthDays[i] + " days");
			break;
		case 2:
			System.out.println("You enter number " + n + " month " + month.February + " has " + monthDays[i] + " days");
			break;
		case 3:
			System.out.println("You enter number " + n + " month " + month.March + " has " + monthDays[i] + " days");
			break;
		case 4:
			System.out.println("You enter number " + n + " month " + month.April + " has " + monthDays[i] + " days");
			break;
		case 5:
			System.out.println("You enter number " + n + " month " + month.May + " has " + monthDays[i] + " days");
			break;
		case 6:
			System.out.println("You enter number " + n + " month " + month.June + " has " + monthDays[i] + " days");
			break;
		case 7:
			System.out.println("You enter number " + n + " month " + month.July + " has " + monthDays[i] + " days");
			break;
		case 8:
			System.out.println("You enter number " + n + " month " + month.August + " has " + monthDays[i] + " days");
			break;
		case 9:
			System.out.println("You enter number " + n + " month " + month.September + " has " + monthDays[i] + " days");
			break;
		case 10:
			System.out.println("You enter number " + n + " month " + month.October + " has " + monthDays[i] + " days");
			break;
		case 11:
			System.out.println("You enter number " + n + " month " + month.November + " has " + monthDays[i] + " days");
			break;
		case 12:
			System.out.println("You enter number " + n + " month " + month.December + " has " + monthDays[i] + " days");
			break;
		default:
			System.out.println("Wrong number!!!!");

		}
	}
}
