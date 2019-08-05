package taskTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Address {

	public static void main(String[] args) throws IOException {
	
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("What is your name? ");

	String name=bf.readLine();
	System.out.println("Where are you live, " + name + " ?");
	String address=bf.readLine();
	System.out.println("You are " + name + ", and you live in " + address);
	}

}
