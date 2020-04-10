package L5_Feb17;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] A = new int[5];
		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
			for (int counter = 1; counter < A.length; counter++) {
				int val = A[counter];
				int j = counter - 1;
				while (j >= 0 && A[j] > val ) {
					A[j + 1] = A[j];
					j--;
				}A[j+1] = val;
			}
		}

	}

}
