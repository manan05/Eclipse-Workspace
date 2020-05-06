package Practice_HB_lec2;

import java.util.Scanner;

public class IsArraySorted {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int[] arr1 = input(arr);
		System.out.println(issorted(arr1));

	}

	public static int[] input(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static int[] bubblesort(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			// System.out.println("Counter" + c + ":");
			for (int j = 0; j < arr.length - 1 - c; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;
	}

	public static boolean issorted(int a[]) {

		boolean isSorted = true;
		boolean isAscending = a[1] > a[0];
		if (isAscending) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					isSorted = false;
					break;
				}
			}
		} else {// descending
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] < a[i + 1]) {
					isSorted = false;
					break;
				}
			}
		}
		return isSorted;
	}

}
