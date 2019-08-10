package Task_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		OddNumbers odd=new OddNumbers();
		odd.input(scn);
		SwitchClass sc=new SwitchClass();
		sc.inputDay(scn);
		EnumClass ec=new EnumClass();
		ec.inputCountry(scn);

	}

}
