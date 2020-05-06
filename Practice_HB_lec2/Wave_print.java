package Practice_HB_lec2;

import java.util.Scanner;

public class Wave_print {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int[][] arr1 = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, {
		// 31, 32, 33, 34, 35 },
		// { 41, 42, 43, 44, 45 } };
		int[][] m = takeinput();
		wave_print(m);
		// display(m);
		System.out.println("END");
	}

	public static int[][] takeinput() {

		// System.out.println("rows ?");
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void wave_print(int[][] arr1) {
		for (int j = 0; j < arr1[0].length; j++) {
			// int z = arr1.length - 1;
			if (j % 2 == 0) {
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i][j] + ", ");
				}

			} else {
				for (int k = arr1.length - 1; k >= 0; k--) {
					System.out.print(arr1[k][j] + ", ");

				}
			}
		}

	}
}
