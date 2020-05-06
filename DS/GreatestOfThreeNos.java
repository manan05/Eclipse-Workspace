package DS;

import java.util.Scanner;

// WAP to find greatest of 3 numbers;
public class GreatestOfThreeNos {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 3 numbers :");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a>b && a>c) {
			System.out.println(a);
		}
		else if (b>a && b>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
