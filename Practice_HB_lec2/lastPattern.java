package Practice_HB_lec2;

import java.util.Scanner;

public class lastPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), t = 1, n;
		for (int r = 1; r <= N; r++) {
			for (int sp = N; sp > r; sp--)
				System.out.print("\t");
			for (n = 1, t = r; n <= r; n++) {
				System.out.print(t + "\t");
				t = t + 1;
			}
			for (int rn = 2, tn = t - 2; rn <= r; rn++, tn--) {
				System.out.print(tn + "\t");
			}
			if (r > 1)
				t--;
			System.out.println();
		}
		int space = 1;
		t = N - 1;
		for (int j = 1; j <= N - 1; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print("\t");
			}
			space++;
			for (int i = 1; i <= (N - j); i++) {
				System.out.print(t + "\t");
				t++;
			}
			t = t - 2;
			for (int k = 1; k < N - j; k++) {
				System.out.print(t + "\t");
				t--;
			}
			System.out.println();
		}
	}
}
