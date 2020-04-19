package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
//		printDec(5);
//		printInc(5);
//		printDecInc(5);
		PDI_withSkips(8);

	}

	public static void printDec(int n) {
		// Base Case
		// -gets StackOverflow Error that means
		// -base case not handled properly
		if (n == 0) {
			return;
		}

		// Self Work
		System.out.println(n);

		// Smaller Input
		printDec(n - 1);
	}

	public static void printInc(int n) {
		// Base Case
		if (n == 0) {
			return;
		}

		// Smaller Input
		printInc(n - 1);

		// Self Work
		System.out.println(n);
	}

	public static void printDecInc(int n) {
		// Base Case
		if (n == 0) {
			return;
		}

		// Self Work
		System.out.println(n);

		// Smaller Input
		printDecInc(n - 1);

		// Self Work
		System.out.println(n);
	}

	public static void PDI_withSkips(int n) {
		// for input = 5 
		// Required Output = 
		// 5
		// 3
		// 1
		// 2
		// 4	
		// base case
		if (n <= 0) {
			return;
		}

		// self work
		if (n % 2 != 0)
			System.out.println(n);

		// Smaller Input
		PDI_withSkips(n-1);

		// self work
		if (n % 2 == 0)
			System.out.println(n);
	}

}
