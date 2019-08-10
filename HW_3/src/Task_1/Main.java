package Task_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		RangeFloat rf=new RangeFloat();
		rf.inputNumbers(bf);
		MinMax m=new MinMax();
		m.inputNumbers(bf);
		ErrorClass ec=new ErrorClass();
		ec.inputError(bf);

	}

}
