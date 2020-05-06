package DS;

import java.util.Scanner;

public class TillPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number:");
		int n = scn.nextInt();
		int c = 0;
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c = 1;
				}
			}
			if (c == 0) {
				System.out.println(i);
			}
			c = 0;

		}

	}
}
