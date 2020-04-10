package Practice_HB_lec2;

import java.util.Scanner;

public class Insertionsort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scn.nextInt();
		int arr[] = new int[N];
		int ab[] = input(N, arr);
		display(insertionSort(ab));
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

	public static int[] insertionSort(int[] arr) {

		for (int counter = 1; counter <= arr.length - 1; counter++) {

			int val = arr[counter];

			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = val;
		}return arr;
	}

}
