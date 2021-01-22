package DS;

import java.util.Scanner;

public class perfectNo {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		int res =perfect(n,sum);
		if(res == n) {
			System.out.println("Is perfect.");
		}
		else {
			System.out.println("Is NOT perfect.");
		}
	}
	public static int perfect(int n,int sum) {
		int i = 1;
		while(i <= n/2) {
			if(n%i == 0) {
				sum = sum + i;
			}
			i++;
		}
		return sum;
	}

}
