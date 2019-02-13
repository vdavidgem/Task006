package handling;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 25;
		int b = 0;
		System.out.println((divide(a, b)));
	}

	public static int divide(int a, int b) {
		int res = 0;
		try {
			res = a / b;

		} catch (ArithmeticException e) {
			System.out.println("don't divide by zero");

		}
		return res;
	}

}
