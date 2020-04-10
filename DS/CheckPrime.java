package DS;

import java.util.Scanner;

//WAP to check whether the number entered is prime or not.
public class CheckPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scn.nextInt();
		int flag = 0;
		if(n == 0 || n == 1) {
			System.out.println(n +" is neither prime nor composite.");
		}
		else {
			for(int i = 2; i<n;i++) {
				if(n%i==0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime");
		}
		
		}
	}

}
