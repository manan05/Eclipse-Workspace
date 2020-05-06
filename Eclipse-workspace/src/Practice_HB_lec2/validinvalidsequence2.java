package Practice_HB_lec2;

import java.util.Scanner;

public class validinvalidsequence2 {
	public static int c;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		System.out.println(abc(n));
	}

	public static void display(int[] arr) {
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static boolean abc(int n) {
		int count = 0;
		int a[] = new int[n];
		int b[] = new int[n - 1];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == a[i + 1]) {
				temp++;

			}

			if (temp == a.length - 1) {
				return false;

			}
		}
		

		for (int i = 0; i < n - 1; i++) {
			if (a[i] >= a[i + 1]) {
				b[i] = 0;
			} else if (a[i] <= a[i + 1]) {
				b[i] = 1;
			}

		}
		for (int j = 0; j < b.length - 1; j++) {
			if (b[j] != b[j + 1]) {
				count = count + 1;
			}
		}
		int sum =0;
		for (int i =0;i<=b.length-1;i++){
			sum = sum + b[i];
			
		}if (sum == b.length){
			return true;
		}
		if (b[0] == 1) {
			return false;
		} else if (count >= 2) {
			return false;
		} else {
			return true;
		}
	}

}