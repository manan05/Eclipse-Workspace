package DS;

import java.util.Scanner;

// WAP to calculate simple interest by taking input and printing the output

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Principal Amount ?");
		int p = scan.nextInt();
		System.out.println("Rate of Interest ?");
		int r = scan.nextInt();
		System.out.println("Time period");
		int t = scan.nextInt();
		int si = (p*r*t)/100;
		System.out.println("S1mple Interest:"+si);
	}
}
