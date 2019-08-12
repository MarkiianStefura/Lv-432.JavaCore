package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpError {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int error;
		error = Integer.parseInt(bufferedReader.readLine());
		switch (error) {
		case 400:
		case 401:
		case 402:
			System.out.println(Error.HTTPERROR.getName());
			break;

		default:
			System.out.println("Not error");
			break;
		}
		
	}

}
