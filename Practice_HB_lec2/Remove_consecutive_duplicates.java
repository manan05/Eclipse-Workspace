package Practice_HB_lec2;

import java.util.Scanner;

public class Remove_consecutive_duplicates {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scn.next();
		System.out.println(rem(s));

	}

	public static String rem(String s) {
		char z = s.charAt(s.length() - 1);
		String ans = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				ans = ans + s.charAt(i);

			}
		}
		ans += z;
		return ans;

	}

}
