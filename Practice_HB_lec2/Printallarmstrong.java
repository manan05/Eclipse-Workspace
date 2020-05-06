package Practice_HB_lec2;

import java.util.Scanner;

public class Printallarmstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ll = scn.nextInt();
		int ul = scn.nextInt();
		PrintallArmstrong(ll, ul);
	}

	public static int count(int N) {
		int b = 0;
		while (N != 0) {
			
			N = N / 10;
			b = b++;
		}
		return b;
	}

	public static void PrintallArmstrong(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			int nod = count(i);
			if (isArmstrong(i, nod)) {
				System.out.println(i);
			}else{
				System.out.println("no");
			}
		}
	}

	public static boolean isArmstrong(int num, int numofdigits) {
		int ans = 0;
		int a = 0;
		int temp = num;
		while (temp != 0) {
			a = temp % 10;
			ans = ans + ((int) Math.pow(a,numofdigits));
			temp = temp / 10;
		}
		if (ans == num) {
			return true;
		} else {
			return false;
		}

	}

}
