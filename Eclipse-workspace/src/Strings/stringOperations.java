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
//		String str1 = "abc";
		System.out.println(reverse_mathEquation(str));
//		String space = "The Sky is Blue";
//		System.out.println(reverseSpace(space));

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
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '+' || str.charAt(i) == '/' 
					|| str.charAt(i) == '-' || str.charAt(i) == '*') {			
				ans = str.charAt(i) + temp + ans;
				temp = "";
			}
			else {
				temp += str.charAt(i);
			}
		}
		ans = temp + ans;
		return ans;
	}
	public static String reverseSpace(String str) {
		String ans = "";
		String[] arr = str.split(" ");
		for(int i = arr.length-1;i>=0;i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.strip();
	}

}
