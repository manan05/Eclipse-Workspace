package wipro_prep;

import java.util.Scanner;

public class gcd_3nos {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = gcd2Nos(a,b);
		System.out.println(gcd2Nos(c, d));
	}
	public static int gcd2Nos(int a,int b) {
		while(a != b) {
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
