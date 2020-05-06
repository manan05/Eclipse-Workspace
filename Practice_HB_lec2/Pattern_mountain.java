package Practice_HB_lec2;

import java.util.Scanner;

public class Pattern_mountain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = 1;
		int N = scn.nextInt();
		for (int r = 1; r < N; r++) {
			t = 1;
			for (int i = 1; i <= r; i++) {
				System.out.print(t++ + "\t");
			}
			for (int s = 1; s <= 2 * (N - r) - 1; s++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= r; j++) {
				System.out.print(--t + "\t");
			}
			System.out.println();
		}
		int i;
		for (i = 1; i <= N; i++) {
			System.out.print(i + "\t");
		}
		for (i = N - 1; i >=1; i--) {
			System.out.print(i + "\t");
		}

	}

}
