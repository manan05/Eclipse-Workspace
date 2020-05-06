package Practice_HB_lec2;

import java.util.Scanner;

public class selection_sort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int ab[] = input(N, arr);
		display(selectionsort(ab));
	}

	public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static int[] selectionsort(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			int min = c;
			for (int j = c + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;

				}
			}
			if (min != c) {
				int temp = arr[c];
				arr[c] = arr[min];
				arr[min] = temp;
			}
		}return arr;
	}

}
