package Practice_HB_lec2;

import java.util.Scanner;

public class BasicCalc {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			char ch = scn.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%') {
				int num1 = scn.nextInt();
				int num2 = scn.nextInt();
				if (ch == '+') {
					System.out.println(sum(num1, num2));
				} else if (ch == '-') {
					System.out.println(minus(num1, num2));
				} else if (ch == '/') {
					System.out.println(divide(num1, num2));
				} else if (ch == '*') {
					System.out.println(multiply(num1, num2));
				} else if (ch == '%') {
					System.out.println(modulus(num1, num2));
				}
			} else if (ch == 'x' || ch == 'X') {
				return;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}

	}

	public static int sum(int num1, int num2) {
		int ans = num1 + num2;
		return ans;
	}

	public static int minus(int num1, int num2) {
		int ans = num1 - num2;
		return ans;
	}

	public static int divide(int num1, int num2) {
		int ans = 0;
		if (num2 != 0) {
			ans = (num1 / num2);
			
		}return ans;
	}

	public static int multiply(int num1, int num2) {
		int ans = num1 * num2;
		return ans;
	}

	public static int modulus(int num1, int num2) {
		int ans = (num1 % num2);
		return ans;
	}

}
