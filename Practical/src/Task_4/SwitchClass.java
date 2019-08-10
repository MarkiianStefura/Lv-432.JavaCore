package Task_4;

import java.util.Scanner;

public class SwitchClass {

	public void inputDay(Scanner scn) {

		System.out.println("Enter number day of week ");
		int i = scn.nextInt();
		switch (i) {
		case 1:
			System.out.println("Monday, Понеділок,Панядзелак");
			break;

		case 2:
			System.out.println("Tuesday, Вівторок, Аўторак");
			break;
		case 3:
			System.out.println("Wensday, Середа, Серада");

			break;
		case 4:
			System.out.println("Thursday, Четвер, Чацвер");
			break;
		case 5:
			System.out.println("Friday, П'ятниця, Пятніца");
			break;
		case 6:
			System.out.println("Satuday, Субота, Субота");
			break;
		case 7:
			System.out.println("Sunday, Неділя, Нядзеля");
			break;
		default:
			System.out.println("Wrong!");

		}
	}
}
