package Task_4;

import java.util.Scanner;

public class SwitchClass {

	public void inputDay(Scanner scn) {

		System.out.println("Enter number day of week ");
		int i = scn.nextInt();
		switch (i) {
		case 1:
			System.out.println("Monday, ��������,����������");
			break;

		case 2:
			System.out.println("Tuesday, ³������, �������");
			break;
		case 3:
			System.out.println("Wensday, ������, ������");

			break;
		case 4:
			System.out.println("Thursday, ������, ������");
			break;
		case 5:
			System.out.println("Friday, �'������, ������");
			break;
		case 6:
			System.out.println("Satuday, ������, ������");
			break;
		case 7:
			System.out.println("Sunday, �����, �������");
			break;
		default:
			System.out.println("Wrong!");

		}
	}
}
