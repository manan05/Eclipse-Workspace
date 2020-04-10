package Practice_HB_lec2;

import java.util.Scanner;

public class SumOfDigits_Recursion {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int sum = 0;
		System.out.println(sumofdigit(N, sum));

	}

	public static int sumofdigit(int n, int sum) {
		if (n == 0) {
			return sum;
		}

		int rem = n % 10;
		sum = sum + rem;
		n = n / 10;
		int ans = sumofdigit(n, sum);
		return ans;
	}

}
