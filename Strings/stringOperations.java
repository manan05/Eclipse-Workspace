package Strings;

import java.util.Scanner;

public class stringOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		printChars(str);
//		System.out.println(checkPalindrome("aabbaa"));
//		subStrings("nitin");
//		palindrome_ss("nitin");
		String str = "1+2*3-20";
		String str1 = "abc";
		System.out.println(reverse_mathEquation(str));

	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static boolean checkPalindrome(String str) {
		int flag = 0;
		for (int i = 0, j = str.length() - 1; i < (str.length() / 2); i++, j--) {
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

	public static void subStrings(String str) {
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si + 1; ei <= str.length(); ei++) {
				System.out.println(str.substring(si, ei));
			}
		}
	}

	public static void palindrome_ss(String str) {
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si + 1; ei <= str.length(); ei++) {
				String check = str.substring(si, ei);
				if (checkPalindrome(check)) {
					System.out.println(check);
				}
			}
		}
	}

	public static String reverse_mathEquation(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			
			ans = str.charAt(i) + ans;

		}
		return ans;
	}

}
