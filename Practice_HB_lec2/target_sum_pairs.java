package Practice_HB_lec2;

import java.util.Scanner;

public class target_sum_pairs {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int a[] = input(N, arr);
		int sum = scn.nextInt();
		int b[] = insertionSort(a);
		targetsum(sum, b);
	}

	public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {

		for (int counter = 1; counter <= arr.length - 1; counter++) {

			int val = arr[counter];

			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = val;
		}
		return arr;
	}

	public static void targetsum(int number, int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] + arr[j] == number) {
					System.out.println(arr[i] + " and " + arr[j]);
				}

			}
		}
		System.out.println();
	}

}
