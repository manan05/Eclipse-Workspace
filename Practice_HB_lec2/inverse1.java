package Practice_HB_lec2;

import java.util.Scanner;

public class inverse1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int ans = 0;
		int count = 1;

		while (a != 0) {

			int rem = a % 10;
			int power = (int) Math.pow(10, rem - 1);
			ans = ans + count * power;
			count++;
			a = a / 10;
		}
		System.out.println(ans);
	}

}
