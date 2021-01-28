package wipro_prep;

import java.util.Scanner;

public class matrix_transpose {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rowA = scn.nextInt();
		int colA = scn.nextInt();
		int[][] A = new int[rowA][colA]; // initial matrix
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colA; j++) {
				A[i][j] = scn.nextInt();
			}
		}
		transpose(rowA, colA, A);
	}

	public static void printArray(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j]);
			}
			System.out.println();
		}

	}

	public static void transpose(int rowA, int colA, int[][] A) {

		int[][] B = new int[colA][rowA];
		for (int i = 0; i < colA; i++) {
			for (int j = 0; j < rowA; j++) {
				B[i][j] = A[j][i];
			}
		}
		printArray(B);
	}

}
