package L5_Feb17;

import java.util.Scanner;

public class Two_dimensionalArrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr1 = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		// int[][] arr2 = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		// display(arr1);
		// int[][] m = takeinput();
		// System.out.println(m);
		display(arr1);
//		 vertical_syso(arr1);
//		 wave_print(arr1);
		 spiral_print(arr1);
		// display(Matrixmultiply(arr1,arr2));
		System.out.println("END");

	}// input for jagged arrays

	public static int[][] takeinput() {

		System.out.println("rows ?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Columns?" + i + "th row");
			int cols = scn.nextInt();
			arr[i] = new int[cols];
			

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("(" + i + "," + j + ")");
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

	public static void vertical_syso(int[][] arr1) {
		for (int j = 0; j < arr1[0].length; j++) {
			for (int i = 0; i < arr1.length; i++)
				System.out.println(arr1[i][j] + ",");
		}
	}

	public static void wave_print(int[][] arr1) {
		for (int j = 0; j < arr1[0].length; j++) {
			// int z = arr1.length - 1;
			if (j % 2 == 0) {
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i][j] + ",");

				}
			} else {
				for (int k = arr1.length - 1; k >= 0; k--) {
					System.out.print(arr1[k][j] + ",");
				}
			}
		}

	}

	public static void spiral_print(int[][] arr1) {
		int rmin = 0;
		int rmax = arr1.length - 1;
		int cmin = 0;
		int cmax = arr1[0].length - 1;
		int counter = 0;
		int nel = arr1.length * arr1[0].length;
		while (counter < nel) {
			for (int row = rmin; counter < nel && row <= rmax; row++) {
				System.out.print(arr1[row][cmin] + " ");

				counter++;
			}
			cmin++;
			for (int col = cmin; counter < nel && col <= cmax; col++) {
				System.out.print(arr1[rmax][col] + " ");

				counter++;
			}
			rmax--;
			for (int row = rmax; counter < nel && row >= rmin; row--) {
				System.out.print(arr1[row][cmax] + " ");

				counter++;
			}
			cmax--;
			for (int col = cmax; counter < nel && col >= cmin; col--) {
				System.out.print(arr1[rmin][col] + " ");

				counter++;

			}
			rmin++;
		}
	}

	public static int[][] Matrixmultiply(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		int cd = c1;
		if (c1 != r2) {
			return null;
		}
		int[][] ans = new int[r1][c2];
		for (int row = 0; row < ans.length; row++) {
			for (int col = 0; col < ans[0].length; col++) {
				int sum = 0;
				for (int k = 0; k < cd; k++) {
					sum += one[row][k] * two[k][col];
				}
				ans[row][col] = sum;
			}
		}
		return ans;

	}
}