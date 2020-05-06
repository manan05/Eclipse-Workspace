package Practice_HB_lec2;

import java.util.Scanner;

public class Reverse_an_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		int arr2[] = input(arr);
		displayArrayReverse(arr2, 0);

	}

	public static int[] input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void displayArrayReverse(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		displayArrayReverse(arr, vidx + 1);
		System.out.print(arr[vidx] + " ");
	}

}
