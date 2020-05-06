package Practice_HB_lec2;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection_array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int arr2[] = new int[N];
		int one[] = input(N, arr);
		int two[] = input(N, arr2);
		insertionSort(one);
		insertionSort(two);
		System.out.println(intersection(one,two));

	}public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0, j = 0; i < one.length && j < two.length;) {
			if (one[i] == two[j]) {
				ans.add(one[i]);
				i++;
				j++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				i++;
			}
		}
		return ans;

	}public static int[] insertionSort(int[] arr) {

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
