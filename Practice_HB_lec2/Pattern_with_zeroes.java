package Practice_HB_lec2;

import java.util.Scanner;

public class Pattern_with_zeroes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int r = 1;
		while (r <= N) {
			int j = 0;
			int t = r;
			while (j < r) {
				System.out.print(t + "\t");
				if (r > 2) {
					int z = 0;
					int m = 3;
					while (m <= r) {
						System.out.print(z + "\t");
						m++;
					}
					break;
				}
				j++;
			}
			if (r > 2) {
				System.out.print(r);

			}
			System.out.println();
			r++;
		}

	}

}
