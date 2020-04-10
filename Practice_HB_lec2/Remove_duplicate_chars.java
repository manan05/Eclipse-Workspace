package Practice_HB_lec2;

import java.util.Scanner;

public class Remove_duplicate_chars {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str1 = scn.next();
		System.out.println(removeDuplicateChars(str1));
	}

	private static String removeDuplicateChars(String sourceStr) {
		char[] chrArray = sourceStr.toCharArray();
		String targetStr = "";

		for (char value : chrArray) {
			
			if (targetStr.indexOf(value) == -1) {
				targetStr += value;
			}
		}
		return targetStr;
	}

}
