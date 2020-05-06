package Practice_HB_lec2;

import java.util.Scanner;

public class Max_occuring_strings {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(getMaxOccuringChar(s));
	}

	public static char getMaxOccuringChar(String str) {
		final int ASCII_SIZE = 256;
		int count[] = new int[ASCII_SIZE];

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; 
		char result = ' ';
		
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}
}
