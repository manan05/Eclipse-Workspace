package Strings;

import java.util.Scanner;

public class stringOps {

	public static void main(String[] args) {
		// printchars
		// checkPalindrome
		// reverse a string
		// subStrings
		// palindrome_ss
		// reverseMathEquation
		// reverseSpace

		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		System.out.println(str);
//		printChars(str);
//		checkPalindrome(str);
//		reverseString(str);
		printSubstring("manan");
		System.out.println("___________________________________");
		palindromicSubstrings("manan");
	}

	// prints characters of the string given
	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	// checks whether the given string is palindrome or not
	public static void checkPalindrome(String str) {
		int flag = 0;
		int n = str.length();
		for (int i = 0; i < (n / 2); i++) {
			if (str.charAt(i) != str.charAt(n - 1 - i)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("is a palindrome;");
		} else {
			System.out.println("not a palindrome;");
		}
	}

	// reverse the given string
	public static void reverseString(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (char ch : arr) {
			System.out.print(ch);
		}
	}

	// prints all the possible substrings of the string
	public static void printSubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	// Palindromic substrings
	public static void palindromicSubstrings(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; j<= str.length(); j++) {
				String ss = str.substring(i,j);
				int flag = 0;
				for(int k = 0, l = str.length()-1; k<(ss.length()/2); k++, l--) {
					if(ss.charAt(k) != ss.charAt(l)) {
						flag = 1;
					}
				}
				if(flag == 0) {
					System.out.println(ss);
				}
			}
		}
	}

}
