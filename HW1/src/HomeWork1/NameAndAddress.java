package HomeWork1;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAndAddress {

	public static void main(String[] args) throws IOException {
		String name;
		String address;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?...please write...");
		name = reader.readLine();
		System.out.println("Where are you live, "+name+"?...please write...");
		address = reader.readLine();
		System.out.println("Your name is "+name+ " Your address is "+address);
		try(FileWriter writer = new FileWriter("nameAndAddress.txt", true) ) {
			writer.write(name_and_address_infile(name, address));
			writer.write("\n");
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static String name_and_address_infile(String name, String address){		
		return "Your name is "+name+ " Your address is "+address;
	}
	
}
