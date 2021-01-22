package DS;

import java.util.Scanner;

public class factorial {
	// 2 methods
	// iterative and recursion
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("factorial of which number ?");
		int n = scn.nextInt();
//		System.out.println(printFactorialIterative(n));
		System.out.println(printFactorialRecursion(n));
		
	}
	public static int printFactorialRecursion(int n) {
		// base case
		if(n == 0) {
			return 1;
		}
		
		// smaller input
		int fnm1 = printFactorialIterative(n-1);
		
		// Self work
		int fn = n * fnm1;
		return fn;
	}
	public static int printFactorialIterative(int n) {
		int ans = 1;
		for(int i = n ; i>=1; i--) {
			ans = ans * i;
		}
		return ans;
	}

}
