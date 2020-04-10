package Practice_HB_lec2;

import java.util.Scanner;

public class String_isPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(ispalindrome(s));
	}

	public static boolean ispalindrome(String str) {

		String abc = "";
		int flag = 0;
		for (int i = 0, j = str.length() - 1; i < str.length() - 1 && j >= 0; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = 1;
			}
		}
		if (flag == 1) {
			return false;
		} else {
			return true;
		}
	}
}
