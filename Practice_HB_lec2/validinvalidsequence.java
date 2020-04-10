package Practice_HB_lec2;

import java.util.Scanner;

public class validinvalidsequence {
	public static int c;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = s.nextInt();
		System.out.println(abc(n));
	}

	public static boolean abc(int n) {
		int count = 0;
		
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n - 2; i++) {
			if (a[i] < a[i + 2]) {
				c = i;
				for (; i < n - 2; i++)
					if (a[i + 1] < a[i + 2]) {
						count = count + 1;
					} else {

					}
			}

		}
		if (count == n - 2 - c) {
			return true;
		} else {
			return false;
		}
	}

}