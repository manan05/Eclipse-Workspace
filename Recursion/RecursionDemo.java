package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
//		printDec(5);
//		printInc(5);
//		printDecInc(5);
//		PDI_withSkips(8);
//		System.out.println(factorial(5));
//		System.out.println(power(2,5));
//		System.out.println(fibonacci(8));
		int[] arr = {2,4,6,8,10,12};
		displayArray(arr, 0);
		
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
	
	public static int factorial(int n) {
		//here fnm1 = factorial of n minus 1
		//and fn = factorial of n ;
		//Base Case
		if(n == 0) {
			return 1;//as 0! is 1
		}
		
		//Smaller input
		int fnm1 = factorial(n-1);
		
		//Self Work
		int fn = fnm1 * n;
		return fn;
		
	}
	
	public static int power(int x,int n) {
		//x remains same
		//pownm1 = power of n minus 1
		//pown = power of n
		
		//Base case
		if(n == 0) {
			return 1;
		}
		
		//Smaller Input
		int pownm1 = power(x,n-1);
		
		//self work
		int pown = pownm1 * x;
		return pown;
	}
	
	public static int fibonacci(int n) {
		//returns nth fibonacci term
		//tnm1 = term n minus 1
		//tnm2 = term n minus 2
		//tn = term n
		
		//Base case
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		//Small Input
		int tnm1 = fibonacci(n-1);
		int tnm2 = fibonacci(n-2);
		
		//Self Work
		int tn = tnm1 + tnm2;
		return tn;
	}
	
	public static void displayArray(int[] arr, int vidx) {
		// vidx = virtual index
		
		//Base Case
		if(vidx == arr.length) {
			return;
		}
		
		//Self Work
		System.out.println(arr[vidx]);
		
		//Smaller input
		displayArray(arr, vidx+1);
	}
	
}
