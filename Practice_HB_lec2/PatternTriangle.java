package Practice_HB_lec2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PatternTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = 1;
		int l = 1;
		int z = 1;
		for (int i = 1; i <= n; i += 2) {
			for (int j = n; j > 1; j--) {
				if (j > i) {
					System.out.print(" ");
				}
			}

		}
		for (int m = 1; m <= n; m++) {
			l = k;
			for (int p = 1; p <= m; p++) {
				System.out.print(l+++"\t");
			}
			k = l--;
			for (int p = 1; p < m; p++) {
				System.out.print(--l+"\t");

			}
			System.out.println();
		}
	}

}
