package Practice_HB_lec2;

import java.util.Scanner;

public class SpiralPrintClockwise {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] m = takeinput();
		spiral_print(m);
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

	public static void spiral_print(int[][] arr1) {
		int rmin = 0;
		int rmax = arr1.length - 1;
		int cmin = 0;
		int cmax = arr1[0].length - 1;
		int counter = 0;
		int nel = arr1.length * arr1[0].length;
		while (counter < nel) {
			for (int col = cmin; counter < nel && col <= cmax; col++) {
				System.out.print(arr1[rmin][col] + ", ");

				counter++;
			}
			rmin++;
			for (int row = rmin; counter < nel && row <= rmax; row++) {
				System.out.print(arr1[row][cmax] + ", ");

				counter++;
			}
			cmax--;
			for (int col = cmax; counter < nel && col >= cmin; col--) {
				System.out.print(arr1[rmax][col] + ", ");

				counter++;
			}
			rmax--;
			for (int row = rmax; counter < nel && row >= rmin; row--) {
				System.out.print(arr1[row][cmin] + ", ");

				counter++;

			}
			cmin++;
		}
	}

}
