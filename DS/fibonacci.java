package DS;

//WAP to print fibonacci series using loops
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13---

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printFibonacci(n);
	}

	public static void printFibonacci(int n) {
		int t1 = 0;
		int t2 = 1;
		int t3 = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(t1 + ",");
			t3 = t1+t2;
			t1 = t2;
			t2 = t3;
		}
	}

}
