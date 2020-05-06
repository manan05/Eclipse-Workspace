package Practice_HB_lec2;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean M=isarmstrong(N);
		System.out.println(M);
	}

	public static int count(int N) {
		int a = 0;
		int b = 0;
		int c = N;
		while (c != 0) {
			b = b++;
			c = c / 10;

		}
		return b;
	}

	public static boolean isarmstrong(int num) {
		int ans = 0;
		int a = 0;
		int b = num;
		while (b != 0) {
			a = b % 10;
			ans = ans + (a * a * a);
			b = b / 10;
		}
		if (ans == num) {
			return true;
		} else {
			return false;
		}
	}
}
