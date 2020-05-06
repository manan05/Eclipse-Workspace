package Array;

import java.util.Arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr = { 2, -1, 3, 5, 6, -2 };
		MaxSumSubArray(arr);

	}

	public static void MaxSumSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int mi = 0;
		int mj = 1;
		for (int i = 0, j = i + 1; i < arr.length && j < arr.length; i++, j++) {
			// Printing all the sub arrays
			int sum = arr[i] + arr[j];
			if (sum > max) {
				max = sum;
				mi = i;
				mj = j;
			}
		}
		System.out.println(max);
		System.out.println("[" + arr[mi] + "," + arr[mj] + "]");
	}

}
