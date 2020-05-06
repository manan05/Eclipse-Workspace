package Practice_HB_lec2;

import java.util.Scanner;

public class FirstIndex {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		int arr2[] = input(arr);
		int item = scn.nextInt();
		System.out.println(findFirstIndex(arr2, 0, item));
		
	}

	public static int[] input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int findFirstIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == item) {
			return vidx;
		}

		int ra = findFirstIndex(arr, vidx + 1, item);
		return ra;
	}

}
