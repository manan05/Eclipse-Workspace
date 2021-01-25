package wipro_prep;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return a;
	}

}
