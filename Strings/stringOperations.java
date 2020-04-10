package Strings;

import java.util.Scanner;

public class stringOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		printChars(str);
	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
