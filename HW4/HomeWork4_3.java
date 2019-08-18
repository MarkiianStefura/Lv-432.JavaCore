import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] num = { 5, -3, -1, -8, 1};
		int pos = 0;
		int minimumNum = num[0];
		int posOfMin = 0;
		int count = 0;
		
		for(int i=0; i<num.length && count < 2; i++) {
			if(num[i]>=0) {
				pos = i;
				count++;
			}
		}
		for(int i=0; i<num.length; i++) {
			if(minimumNum>num[i]) {
				minimumNum = num[i];
				posOfMin = i;
			}
		}
		System.out.println("Position second positive num = "+pos);
		System.out.println("Minimum element = "+minimumNum);
		System.out.println("Position minimum element = "+posOfMin);
	}
}
