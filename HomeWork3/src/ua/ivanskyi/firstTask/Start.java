package ua.ivanskyi.firstTask;

public class Start {

	static boolean checkRange(float x) {

		return x >= -5 && x <= 5 ? true : false;
	}

	static void checkAll(float x, float y, float z) {
		if (checkRange(x) && checkRange(y) && checkRange(z) == false) {
			System.out.println("one of float is not range -5;5");

		} else {
			System.out.println("all are in range");
		}

	}

	static int max(int x, int y) {

		return x >= y ? x : y;

	}

	static int min(int x, int y) {
		return x <= y ? x : y;
	}

	public enum Errors {
		BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED;

	}

	static void findError(int codeNum) {

		switch (codeNum) {
		case 400:
			System.out.println(Errors.BAD_REQUEST.name());
			break;
		case 401:
			System.out.println(Errors.BAD_REQUEST.name());
			break;
		case 402:
			System.out.println(Errors.BAD_REQUEST.name());
			break;
		default:
			break;

		}

	}

	public static void main(String[] args) {

		float a = -4;
		float b = 5;
		float c = -6;

		int x = 13;
		int y = 9;
		int z = 1;

		int errorCode = 401;

		checkAll(a, b, c);

		System.out.println(min(x, min(y, z)));
		System.out.println(max(x, max(y, z)));

		findError(errorCode);

	}

}
