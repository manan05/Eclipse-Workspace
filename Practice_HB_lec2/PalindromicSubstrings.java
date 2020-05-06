package Practice_HB_lec2;

import java.util.Scanner;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(countPalindromicSS(s));
	}
	public static int countPalindromicSS(String str) {
		int c = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis + orbit) == str.charAt(axis - orbit)) {
					c++;
				} else {
					break;
				}
			}
		} // even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis + orbit)) == str.charAt((int) (axis - orbit))) {
					c++;
				} else {
					break;
				}
			}
		}

		return c;
	}

}
