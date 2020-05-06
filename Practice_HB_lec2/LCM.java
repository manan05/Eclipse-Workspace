package Practice_HB_lec2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int c = 2;
		int f = 2;
		int lcm = 0;

		if (N1 >= N2) {
			while (f <= N2) {
				if (N1 % N2 == 0) {
					lcm = N1;
					break;

				} else if (N2 % f == 0 && N1 % f == 0) {
					lcm = (N1 * N2) / f;
					break;
				} else {
					f = f + 1;
					lcm = N1 * N2;
					continue;

				}
			}
		} else if (N2 > N1) {
			while (c <= N1) {
				if (N2 % N1 == 0) {
					lcm = N2;
					break;
				} else if (N2 % c == 0 && N1 % c == 0) {
					lcm = (N1 * N2) / c;
					break;
				} else {
					c = c + 1;
					lcm = N1 * N2;
					continue;
				}
			}
		} else {
			lcm = N1;
		}
		System.out.println(lcm);

	}
}
