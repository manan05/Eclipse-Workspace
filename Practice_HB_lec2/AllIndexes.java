package Practice_HB_lec2;

import java.util.Scanner;

public class AllIndexes {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		int arr2[] = input(arr);
		int item = scn.nextInt();
		int arr3[] = findAllIndex(arr2, 0, item, 0);
		displayArray(arr3, 0);
		

	}
	public static void displayArray(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		System.out.print(arr[vidx] + " ");
		displayArray(arr, vidx + 1);

	}

	public static int[] input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int[] findAllIndex(int[] arr, int vidx, int item, int count) {

		if (vidx == arr.length) {
			int[] baseResult = new int[count];
			return baseResult;
		}

		if (arr[vidx] == item) {
			int[] ra = findAllIndex(arr, vidx + 1, item, count+1);
			ra[count] = vidx;
			return ra;
		} else {
			int[] ra = findAllIndex(arr, vidx + 1, item, count);
			return ra;
		}

	}
}
