package Strings;

import java.util.Scanner;

public class stringOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		printChars(str);
		System.out.println(checkPalindrome("aabbaa"));
	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static boolean checkPalindrome(String str) {
		int flag = 0;
		for (int i = 0, j = str.length() - 1; i < (str.length()/2); i++, j--) {
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
