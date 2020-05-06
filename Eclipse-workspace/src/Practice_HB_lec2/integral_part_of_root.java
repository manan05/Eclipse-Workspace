package Practice_HB_lec2;

import java.util.Scanner;

public class integral_part_of_root {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		System.out.println(root(N));
	}

	public static int root(int N) {
		int a = 0;
		a = (int) Math.pow(N, 0.5);
		return a;
	}

}
