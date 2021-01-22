package L1_CB;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int div = 2;
		int flag = 0 ;
		
		while (div <= n - 1) {

			if (n % div == 0) {
				flag = 1;
				break ;
			} 

			div = div + 1;
		}
		
		if(flag == 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
