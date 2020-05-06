package Array;

import java.util.Scanner;

public class TwoDArrayDemo {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// Defining the 2D array
		// allocating space for the 2D array
//		arr = new int[3][3];
//		System.out.println(arr[0][0]);
//		arr = takeInput();
		int arr1[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		display(arr);
//		verticalSyso(arr);
//		wavePrint(arr);
//		display(arr1);
//		spiralPrint(arr1);
//		System.out.println("END.");
//		int[][] arrz = new int[][3]; // Not Possible
		// ERROR cannot specify an array dimension after an empty dimension
		int[][] arrayy = new int[3][];
//		System.out.println(arrayy[1][0]);
		arrayy[0] = new int[4];
		arrayy[1] = new int[3];
		arrayy[2] = new int[2];
//		System.out.println(arrayy[0]);
//		System.out.println(arrayy[0][3]);
		display(arrayy);

	}

	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) { // loop for rows
			for (int j = 0; j < arr[i].length; j++) { // loop for the rows of rows
				System.out.print(arr[i][j] + " "); // print the element at i,j
			}
			System.out.println(); // so that after each row a new line is printed
		}
	}

	// Take input
	public static int[][] takeInput() {
		System.out.println("Rows?");
		int row = scn.nextInt(); // no. of rows
		int arr[][] = new int[row][]; // allocating space for rows
		for (int i = 0; i < row; i++) {
			System.out.println("Columns? for " + i + " th row");
			int col = scn.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < col; j++) {
				System.out.println("Element at  arr[" + i + "][" + j + "]");
				arr[i][j] = scn.nextInt();

			}
		}
		return arr;
	}

	// Vertical syso
	// 1 2 3
	// 4 5 6
	// 7 8 9
	// output = 1,
	// 4,---

	public static void verticalSyso(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[j][i]);
			}
		}
	}

	// Wave Print
	// 1 2 3
	// 4 5 6
	// 7 8 9
	// op = 1 4 7 8 5 2 3 6 9;
	public static void wavePrint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println(arr[j][i]);
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.println(arr[j][i]);
				}
			}

		}
	}

	// Spiral Print
	// 11 12 13 14
	// 21 22 23 24
	// 31 32 33 34
	// 41 42 43 44
	// op = 11 21 31 41 42 43 44 34 24 14 13 12 22 32 33 23;

	public static void spiralPrint(int[][] arr1) {
		int rmin = 0;
		int rmax = arr1.length-1;
		int cmin = 0;
		int cmax = arr1[0].length-1;
		int counter = 0;
		int elems = arr1.length * arr1[0].length;
		// printing loop
		while (counter < elems) {
			for (int row = rmin; counter < elems && row <= rmax; row++) {
				System.out.print(arr1[row][cmin]+ ", ");
				counter++;
			}
			cmin++;
			for (int col = cmin; counter < elems && col <= cmax; col++) {
				System.out.print(arr1[rmax][col]+", ");
				counter++;
			}
			rmax--;
			for (int row = rmax; counter < elems && row >= rmin; row--) {
				System.out.print(arr1[row][cmax] + ", ");
				counter++;
			}
			cmax--;
			for (int col = cmax; counter < elems && col >= cmin; col--) {
				System.out.print(arr1[rmin][col] + ", ");
				counter++;
			}
			rmin++;
			
		}
	}
	
}
