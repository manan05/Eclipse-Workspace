package Practice_HB_lec2;

import java.util.Scanner;

public class Binarysearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int ab[] = input(N,arr);
		int number = scn.nextInt();
		System.out.println(binarysearch(ab, number));

	}

	public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static int binarysearch(int[] array, int item) {
		int l = 0;
		int r = array.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (item < array[mid]) {
				r = mid - 1;
			} else if (item > array[mid]) {
				l = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}
}
