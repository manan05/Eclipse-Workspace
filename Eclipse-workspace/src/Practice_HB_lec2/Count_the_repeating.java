package Practice_HB_lec2;

import java.util.Scanner;

public class Count_the_repeating {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int number = scn.nextInt();
		int search = scn.nextInt();
		int m =count(number,search);
		System.out.println(m);
	}

	public static int count(int number, int search) {

		int temp = 0;
		int count = 0;
		while (number != 0) {
			temp = number % 10;
			if (temp == search) {
				count++;
			}
			number = number / 10;
		}return count;
	}

}
