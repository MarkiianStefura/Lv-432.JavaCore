package PracticalTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//1
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please three numbers...");
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		int counter = 0;
		if(a%2!=0){
			counter++;					
		}if(b%2!=0){
			counter++;	
		}if (c%2!=0) {
			counter++;	
		}
		System.out.println("how many of them are odd..."+counter);
		//2
		int deyWeek;
		System.out.println("Enter the number of the day of the week");
		deyWeek = Integer.parseInt(reader.readLine());
		switch (deyWeek) {
		case 1:
			System.out.println("��������"+" Monday "+"Montag");
			break;
		case 2:
			System.out.println("³������"+" Tuesday "+"Dienstag");
			break;
		case 3:
			System.out.println("������"+" Wednesday "+"Mittwoch");
			break;
		case 4:
			System.out.println("������"+" Thursday "+"Donnerstag");
			break;
		case 5:
			System.out.println("�'������"+" Friday "+"Freitag");
			break;
		case 6:
			System.out.println("������"+" Saturday "+"Samstag");
			break;
		case 7:
			System.out.println("�����"+" Sunday "+"Sonntag");
			break;
		default:
			break;
		}
		
		//3		
		System.out.println("Enter a contry name... ");
		String s = reader.readLine();		
		switch (s) {
		
		case "Ukraine":
		case  "Poland" :
		case  "Germany" :
		case  "Greece " :	
			System.out.println(Continent.EUROPE + " "+ Continent.EUROPE.getName());
			break;
		case "China":
		case "India":
		case "Japan ":
		case "Turkey":
			System.out.println(Continent.ASIA + " "+ Continent.ASIA.getName());
			break;
		case "United States":
		case "Brazil":
		case "Argentina":
		case "Canada":
			System.out.println(Continent.AMERICA+" " + Continent.AMERICA.getName());
			break;
		
		default:
			System.out.println("have not found such a country");			
			break;
		}
		
		
	}

}
