package Practice_HB_lec2;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {

		int n, reverse = 0;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		System.out.println(reverse);
	}

}
