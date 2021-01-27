package wipro_prep;

import java.util.Scanner;

public class findIfPrimeorNot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(isPrime(n));
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			int flag = 0;
			for (int i = 2; i * i <= n; i++) {
				if(n%i == 0) {
					flag = 1;
				}
			}
			if(flag == 1) {
				return false;
			}
			else {
				return true;
			}
		}
	}

}
