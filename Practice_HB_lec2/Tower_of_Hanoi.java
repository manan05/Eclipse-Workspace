package Practice_HB_lec2;

import java.util.Scanner;

public class Tower_of_Hanoi {
	static Scanner scn = new Scanner(System.in);

	static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) {
		if (n == 1) {
			System.out.println("Move 1th disc from " + from_rod + " to " + to_rod);
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move " + n + "th disc from " + from_rod + " to " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

	public static void main(String args[]) {
		int n = scn.nextInt();
		towerOfHanoi(n, "T1", "T2", "T3");
		int z = (int) Math.pow(2, n);
		System.out.println(z-1);
	}
	

}
