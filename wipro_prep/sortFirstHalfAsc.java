package wipro_prep;

import java.util.Scanner;
import java.util.Arrays;

public class sortFirstHalfAsc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sortFirstHalfAscOtherHalfDesc(arr);
	}

	public static void sortFirstHalfAscOtherHalfDesc(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
