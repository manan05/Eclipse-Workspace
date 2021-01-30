package wipro_prep;

import java.util.Scanner;

public class stringEvenNumSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int num = Integer.parseInt(str);
		EvenElemSum(num);
	}
	public static void EvenElemSum(int num) {
		int temp = num;
		int sum = 0;
		while(temp !=0) {
			int rem = temp%10;
			
			if(rem %2 == 0) {
				sum =sum +rem;
			}
			temp = temp/10;
		}
		System.out.print(sum);
	}

}
