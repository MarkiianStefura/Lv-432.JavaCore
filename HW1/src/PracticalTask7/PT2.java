package PracticalTask7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PT2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//In the main() method declare map employeeMap of pairs <Integer, String>.
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		//Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
		employeeMap.put(121, "Roma");
		employeeMap.put(122, "Lasy");
		employeeMap.put(123, "Petya");
		employeeMap.put(124, "Nazar");
		employeeMap.put(125, "Slava");
		employeeMap.put(126, "Igor");
		employeeMap.put(127, "Nadya");
		System.out.println(employeeMap);

		//Ask user to enter ID, then find and write corresponding name from your map.
		//If you can't find this ID - say about it to user (use function containsKey()).
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter a number from 121 to 127... ");
		int a =  Integer.parseInt(reader.readLine());		
		if (employeeMap.containsKey(a)) {
			System.out.println("ID number = "+ a + " Name = " + employeeMap.get(a));
		}else {
			System.out.println("Error ID number");
		}
		//Ask user to enter name, verify than you have name in your map and write corresponding ID.
		//If you can't find this name -say about it to user (use function containsValue()).
		System.out.println("Please enter nama...");
		String name = reader.readLine();
		if (!employeeMap.containsValue(name)) {
			System.out.println("Error name");
		}
	}
	   
	
}


