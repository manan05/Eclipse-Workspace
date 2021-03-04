package wipro_prep;

import java.util.Scanner;

public class sumOfArrayElements {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sumOfArrayElems(arr);
	}

	public static void sumOfArrayElems(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int num = arr[i];
			int temp = num;
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}
			System.out.print(sum + " ");
		}
	}
}
