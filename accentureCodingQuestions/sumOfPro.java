package accentureCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sumOfPro {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr1[] = { 22, 7, 1, -5, 5, -2 };
		int arr2[] = { 4, -1, 21, 12, 10, -3 };
		int n = arr1.length;
		sumOfProduct(arr1, arr2, n);
	}

	public static void sumOfProduct(int[] arr1, int[] arr2, int n) {
		int sum = 0;
		for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
			sum += arr1[i] * arr2[j];
		}
		System.out.println(sum);
	}

}
