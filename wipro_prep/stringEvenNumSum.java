package wipro_prep;

import java.util.Scanner;

public class stringEvenNumSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int n = Integer.parseInt(str);
		evenElemSum(n);
	}

	public static void evenElemSum(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			temp /= 10;
		}
		System.out.print(sum);
	}
}
