package Practice_HB_lec2;

import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int z = 0;
		for (int i = 0; i < n; i++) {
			z = i + 1;
			for (int j = 1; j < n - i; j++) {
				System.out.print("  ");

			}
			for (int k = 0; k <= i; k++) {

				System.out.print(z++ + " ");

			}
			z = 2 * i;
			for (int k = i; k > 0; k--) {

				System.out.print(z-- + " ");

			}

			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			z = i + 1;
			for (int j = n-i-1; j >0; j--) {
				System.out.print("  ");

			}
			for (int k = 0; k <= i; k++) {

				System.out.print(z++ + " ");

			}
			z = 2 * i;
			for (int k = i; k > 0; k--) {

				System.out.print(z-- + " ");

			}
			System.out.println();
		}

	}
}
