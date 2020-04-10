package Practice_HB_lec2;

import java.util.Scanner;

public class LastIndex {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		int arr2[] = input(arr);
		int item = scn.nextInt();
		System.out.println(findLastIndex(arr2, 0, item));

	}

	public static int[] input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int findLastIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int ra = findLastIndex(arr, vidx + 1, item);

		if (ra == -1 && item == arr[vidx]) {
			return vidx;
		} else {
			return ra;
		}
	}

}
