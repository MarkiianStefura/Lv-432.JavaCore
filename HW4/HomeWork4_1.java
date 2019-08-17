import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of month");
		int mon = Integer.parseInt(br.readLine());
		
		int mn[ ]= { 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for(int i = 0; i < mn.length; i++) {
			if(i == mon-1) {
				System.out.println("Month "+ mon +" have " + mn[i] + " days");
			} else {
				System.out.println("Incorect month number");
			}
		}
	}
}
