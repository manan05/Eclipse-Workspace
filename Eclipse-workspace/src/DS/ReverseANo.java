package DS;

//WAP to reverse a number
import java.util.Scanner;

public class ReverseANo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scn.nextInt();
		int newno = n;
		int t = 0;
		long z = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		while (newno != 0) {
			t = newno % 10; // Remainder store karna hai
			z = z * 10 + t; // because power of tens karna padega
			newno /= 10; // to make the loop stop
		}
		
		if(z > max || z < min) {
			System.out.println("0");
		}
		else {
			System.out.println((int)z);
		}
		
	}
}
