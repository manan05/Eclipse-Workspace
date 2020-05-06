package Practice_HB_lec2;

import java.util.Scanner;

public class ReverseArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int ab[] = input(N, arr);
		reverse(ab);
		display(ab);
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
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
	}

	public static void reverse(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}