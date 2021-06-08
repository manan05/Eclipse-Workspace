package accentureCodingQuestions;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		countDig(arr, n, k);
		// arr = 12 22 3 34 899 112 3 44 552
	}

	public static void countDig(int[] arr, int n, int k) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int temp = arr[i];

			int c = 0;
			while (temp != 0) {
				
				c += 1;
				temp = temp / 10;
			}
			if (c == k) {
				ans = ans + 1;
			}
		}
		System.out.println(ans);
	}

}
