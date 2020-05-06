/*Create the functions of the following programs
 *  Q1 Print all primes
 * Q2 Print all Armstrong numbers 
 * Q3 Power (x^n)
 * Q4 log of a number (log to the base 2 1024 = 10)|| (a=b^c)
 * Q5 GCD of a number
 * Q6 LCM of a number
 *
 */

package L3_Feb10;

import java.util.Scanner;

public class functions_6programs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ll = scn.nextInt();
		int ul = scn.nextInt();
		PrintallArmstrong(ll, ul);
//		Printallprime(ll, ul);
//		System.out.println("Num");
//		int num = scn.nextInt();
//		System.out.println("Power");
//		int p = scn.nextInt();
//		
//		int a =power(num , p);
//		System.out.println(a);
//		isArmstrong(num,3);
		

	}
//
//	public static void Printallprime(int ll, int ul) {
//		for (int i = ll; i < ul; i++) {
//			if (isprime(i))
//				System.out.println(i);
//		}
//
//	}
//
//	public static boolean isprime(int num) {
	// int c = 2;
	// int flag = 0;
	// while (c < num) {
	// if (num % c == 0) {
	// flag = 1;
	// break;
	// }
	// c++;
	//
	// }
	// if (flag == 0) {
	// return true;
	// } else {
	// return false;
	// }
	//
	// }

	public static void PrintallArmstrong(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			int nod = noofdigits(i);
			if (isArmstrong(i, nod)) {
				System.out.println(i);
			}
		}

	}

	public static int noofdigits(int num) {
		int c = 0;
		while (num != 0) {
			num = num / 10;
			c++;

		}
		return c;
	}

	public static boolean isArmstrong(int num, int numofdigits) {
		int ans = 0;
		int a = 0;
		int temp = num;
		while (temp != 0) {
			a = temp % 10;
			ans = ans + ((int) Math.pow(a, numofdigits));
			temp = temp / 10;
		}
		if (ans == num) {
			return true;
		} else {
			return false;
		}

	}
//	public static int power(int x, int n){
//		int a = x;
//		while (n1){
//			a=a*x;
//			n--;
//		}return a;
//	}

}
