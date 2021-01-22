package wipro_prep;

import java.util.Scanner;

public class josh_apples {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // Total number of apples josh wants to buy
		int m1 = scn.nextInt(); // Shop A no. of apples in a lot
		int p1 = scn.nextInt(); // Shop A price of a lot
		int m2 = scn.nextInt(); // Shop B no. of apples in a lot
		int p2 = scn.nextInt(); // Shop B price of a lot
		int minPrice = -1;
		if(p1<p2) {
			if(n%m1 == 0) {
				minPrice = (n/m1) * p1;
			}
			else {
				for(int i = 0; m1*i<n;i++) {
					int c = n - m2*i;
					if(c%m1 == 0) {
						minPrice = (i)*p2 + ((c/m1)*p1);
						break;
					}
				}
			}
		}
		else {
			if(n%m2 == 0) {
				minPrice = (n/m2) * p2;
			}
			else {
				for(int i = 0; m2*i<n;i++) {
					int c = n - m1*i;
					if(c%m2 == 0) {
						minPrice = (i)*p1 + ((c/m2)*p2);
						break;
					}
				}
			}
		}
		System.out.println(minPrice);
		
	}
}
