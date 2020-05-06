package Practice_HB_lec2;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int r=0;
		int maxrows = scn.nextInt();
		for (int i = 0; i <= maxrows; i++) {
			int num = 1;
			r = i + 1;
			for (int col = 0; col <= i; col++) {
				if (col > 0) {
					num = num * (r - col) / col;
				}
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
