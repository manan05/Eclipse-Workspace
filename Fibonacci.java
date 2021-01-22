import java.util.Scanner;

/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 06-Aug-2020
 */

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t1 = 0;
		int t2 = 1;
		int sum = 0;
		
		for(int i = 0; i<=n; i++) {
			System.out.println(t1);
			sum = t1+t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
