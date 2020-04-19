package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		printDec(5);

	}
	public static void printDec(int n) {
		//Base Case
		//-gets StackOverflow Error that means
		//-base case not handled properly
		if(n == 0) {
			return;
		}
		
		//Self Work
		System.out.println(n);
		
		//Smaller Input
		printDec(n-1);
		
		
		
	}

}
