package Task_1;

import java.io.BufferedReader;
import java.io.IOException;

public class ErrorClass {
	Error error;

	public void inputError(BufferedReader bf) throws IOException {
		System.out.println("Enter number of error (400/401/402/403/404)");
		int i = Integer.parseInt(bf.readLine());
		switch (i) {
		case 400:
			System.out.println("Error: " + Error.BAD_REQUEST);
			break;
		case 401:
			System.out.println("Error: " + Error.UNAUTHORIZED);
			break;
		case 402:
			System.out.println("Error: " + Error.BAD_REQUEST);
			break;
		case 403:
			System.out.println("Error: " + Error.FORBIDDEN);
			break;
		case 404:
			System.out.println("Error: " + Error.NOT_FOUND);
			break;
		default:
			System.out.println("Wrong!!!!Error not found!!!!!");
		}

	}
}
