package wipro_prep;

import java.util.Scanner;

public class matrix_multiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row1 = scn.nextInt(); // no of rows of A
		int col1 = scn.nextInt(); // no of cols of A
		int[][] A = new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				A[i][j] = scn.nextInt();
			}
		}
		int row2 = scn.nextInt(); // no of rows of B
		int col2 = scn.nextInt(); // no of cols of B
		int[][] B = new int[row2][col2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				B[i][j] = scn.nextInt();
			}
		}
		multiply(A, B);
	}

	public static void printArray(int row, int col, int[][] arr) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multiply(int[][] A, int[][] B) {
		int rowA = A.length;
		int colA = A[0].length;
		int rowB = B.length;
		int colB = B[0].length;
		if (colA != rowB) {
			System.out.println("Multiplication not possible.");
			return;
		}
		printArray(rowA, colA, A);
		System.out.println();
		printArray(rowB, colB, B);
		System.out.println();
		int[][] res = new int[rowA][colB];
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				for (int k = 0; k < rowB; k++) {
					res[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		printArray(rowA, colB, res);
	}

}
