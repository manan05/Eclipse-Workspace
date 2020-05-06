package L6_Feb18;
// ARRAY LIST OPERATIONS 

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists106 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		int N = scn.nextInt();
//		int one[] = new int[N];
//		int two[] = new int[N];
////		int[] one = { 10, 10, 20, 40, 40, 50, 50 };
////		int[] two = { 10, 10, 10, 30, 40, 50, 50, 50, 60 };
//		input(N,one);
//		input(N,two);
//		System.out.println(intersection(one, two));

		 int[] arr1 = { 1, 1, 1, 1 };
		 int[] arr2 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		 System.out.println(sumofArrays(arr1, arr2));
	}

	public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
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

	}

	public static int noofdigits(int num) {
		int c = 0;
		while (num != 0) {
			num = num / 10;
			c++;

		}
		return c;
	}

	public static ArrayList<Integer> sumofArrays(int[] one, int[] two) {
		ArrayList<Integer> a = new ArrayList<>();
		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += one[i];
			if (j >= 0)
				sum += two[j];
			int rem = sum % 10;
			a.add(0, rem);
			carry = sum / 10;
			j--;
			i--;
		}
		if (carry != 0) {
			a.add(carry);

		}
		return a;

	}
}
