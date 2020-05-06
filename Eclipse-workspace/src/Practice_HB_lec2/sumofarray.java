package Practice_HB_lec2;

import java.util.ArrayList;
import java.util.Scanner;

public class sumofarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int abc[] = new int[N];
		int one[] = input(abc);
		
		int M = scn.nextInt();
		int def[] = new int[M];
		int two[] = input(def);
		display(sumofArrays(one, two));
		System.out.print("END");
	}

	public static int[] input(int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
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
			a.add(0,carry);

		}
		return a;

	}public static void display(ArrayList<Integer> arrayList){
		for (int val : arrayList){
			System.out.print(val + ", ");
		}
	}
}
