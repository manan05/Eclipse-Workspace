package Practice_HB_lec2;

import java.util.Scanner;

public class Mirrorstarpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter N : ");
		int n = sc.nextInt();
//		int n = 7;
		int nst = n / 2 + 1;
		int nsp = -1;

		for (int row = 1; row <= n; row++) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			int cst = 1;
			if (row == 1 || row == n)
				cst = 2;

			for (; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			System.out.println();
			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

		}

	}
}
