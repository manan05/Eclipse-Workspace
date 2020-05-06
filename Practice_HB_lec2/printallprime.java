package Practice_HB_lec2;

import java.util.Scanner;

public class printallprime {

	public static void main(String[] args) {
		int start, end, i, j, count = 0;

		Scanner scn = new Scanner(System.in);
		end = scn.nextInt();

		for (i = 2; i <= end; i++) {
			count = 0;
			for (j = 2; j <i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}
}
