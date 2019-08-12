import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer nuber a...");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter integer nuber b...");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter integer nuber c...");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("Maximum between input number is " + getMax(a, getMax(b, c)));
		System.out.println("Minimum between input number is " + getMin(a, getMin(b, c)));
		
		System.out.println("------------------------------------");
		
		System.out.println("Enter float nuber a...");
		float f1 = Integer.parseInt(br.readLine());
		System.out.println("Enter float nuber b...");
		float f2 = Integer.parseInt(br.readLine());
		System.out.println("Enter float nuber c...");
		float f3 = Integer.parseInt(br.readLine());
		
		if(compareNumber(f1, f2, f3) == true) {
			System.out.println("All entered number belong range -5:5");
		}
		else {
			System.out.println("Some number not belong range -5:5");
		}
		
		System.out.println("------------------------------------");
		System.out.println("Enter error code from 400 to 404...");
		int code = Integer.parseInt(br.readLine());
		switch (code) {
        case 400: 
            System.out.println("Error is " + HTTPError.BadRequest);
            break;
        case 401: 
            System.out.println("Error is " + HTTPError.Unauthorized);
            break;
        case 402:
                 System.out.println("Error is " + HTTPError.PaymentRequired);
            break;
        case 403:
            System.out.println("Error is " + HTTPError.Forbidden);
       break;
        case 404:
            System.out.println("Error is " + HTTPError.NotFound);
       break;
        default:
            System.out.println("Wrong error number");
            break;
    }
	}
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	public static int getMin(int a, int b) {
		return a < b ? a : b;
	}
	public static boolean compareNumber(float f1, float f2, float f3) {
		if((f1 >= -5 && f1 <= 5) & (f2 >= -5 && f2 <= 5) & (f3 >= -5 && f3 <= 5))
			return true;
		else return false;
	}
	enum HTTPError {
		BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound
	}
}
