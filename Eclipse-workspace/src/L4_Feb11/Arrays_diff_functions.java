 package L4_Feb11;

import java.util.Scanner;

public class Arrays_diff_functions {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int[] array2 = { 4, 2, 0, 3, 1 };
		int[] array3 = { 5, 10, 3, 1, 8, 11 };
		// display(array2);
		// System.out.println(maximum(array));
		// System.out.println("Enter the item to search;");
		// int item = scn.nextInt();
		// System.out.println(linearsearch(array,item));
		// reverse(array);
		// display(array);
		// System.out.print("Times you want to rotate:");
		// int p = scn.nextInt();
		// int[] arr1 = rotate(array,p);
		// display(arr1);
		// int[] arrayy = inverse(array2);
		// display(arrayy);
		//
		// display(array3);
		// System.out.println("Term to search:::");
		// int q = scn.nextInt();
		//
		 System.out.println(binarysearch(array, 60));
//		bubblesort(array3);
//		display(array3);
		// selectionsort(array3);
		// display(array3);

	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static int maximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int linearsearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (item == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void reverse(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static int[] rotate(int[] arr, int k) {
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
			//
			//
		}
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				ans[i] = arr[i + ans.length - k];

			} else {
				ans[i] = arr[i - k];
			}
		}
		return ans;
	}

	public static int[] inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
		return inv;
	}

	// Only for sorted arrayssss
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

	public static void bubblesort(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			System.out.println("Counter" + c + ":");
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.println("Counter" + c + ":" + j);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	public static void selectionsort(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			int min = c;
			for (int j = c + 1; j < arr.length ; j++) {
				if (arr[min] > arr[j]) {
					min = j;

				}
			}
			if (min != c) {
				int temp = arr[c];
				arr[c] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
