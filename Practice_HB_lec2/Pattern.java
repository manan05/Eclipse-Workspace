// Fibonacci Pattern
package Practice_HB_lec2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int t1 = 0;
		int t2 = 1;
		
				while (t1 < N) {
					for (int i = 1; i <= N; i++) {
						for (int j = 1; j <= i; j++) {
					System.out.print(t1 + " ");

					int sum = t1 + t2;
					t1 = t2;
					t2 = sum;
				}System.out.println();
			}
		}

	}
}