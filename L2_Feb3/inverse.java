package L2_Feb3;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int ans = 0;
		int count = 1;
		int temp = a;
		while (temp != 0) {

			int rem = temp % 10;
			int power = (int) Math.pow(10, rem - 1);
			ans = ans + count * power;
			count++;
			temp = temp / 10;
			// }
			// if (ans == a) {
			// System.out.println(true);
			// }else{
			// System.out.println(false);
			// }
		}System.out.println(ans);

	}
}