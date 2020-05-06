package DS;

import java.util.Scanner;

//WAP to find multiplicative inverse
public class MultiplicativeInverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		inverse(n);

	}
	
	public static void inverse(int n) {
//		if(n == 0) {
//			System.out.println("No multiplicative inverse;");
//		}
			int z = 1/(n);
			System.out.println(z);
		
	}

}
