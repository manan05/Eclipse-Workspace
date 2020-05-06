package Practice_HB_lec2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		int a, b, N1,N2, t, hcf, lcm;
		Scanner scn = new Scanner(System.in);
		N1 = scn.nextInt();
		N2 = scn.nextInt();

		a = N1;
		b = N2;

		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}

		hcf = a;
		lcm = (N1 * N2)/hcf ;
		System.out.print(lcm);
	}

}
