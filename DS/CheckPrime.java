package DS;

import java.util.Scanner;

//WAP to check whether the number entered is prime or not.
public class CheckPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scn.nextInt();
		checkPrime(n);
	}
	public static void checkPrime(int n) {
		int flag = 0;
		if(n == 0 || n ==1) {
			System.out.println("Not a prime number.");
		}
		else {
			for(int i =2;i<=n/2;i++) {
				if(n%i == 0) {
					flag = 1;
				}
			}
		}
		if(flag == 1) {
			System.out.println("Not a prime number.");
		}
		else if(flag == 0) {
			System.out.println("Prime number.");
		}
	}

}
