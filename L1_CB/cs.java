package L1_CB;

import java.util.Scanner;

public class cs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int c = 2;
		while (c <= N1 && c <= N2) {
			if (c % N1 == 0 && c % N2 == 0) {
				System.out.println(c);
			}
		}
		c = c + 1;
	}

}
