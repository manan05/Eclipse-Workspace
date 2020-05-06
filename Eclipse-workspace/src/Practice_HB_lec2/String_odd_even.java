package Practice_HB_lec2;

import java.util.Scanner;

public class String_odd_even {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scn.next();
		System.out.println(toggle(s));
	}

	public static String toggle(String sentence) {
		String toggled = "";

		for (int i = 0; i < sentence.length(); i++) {

			char letter = sentence.charAt(i);

			if (i % 2 == 0) {
				int z = (int) letter;
				z = z + 1;
				toggled += (char) (z);

			} else {
				int z = (int) letter;
				z = z - 1;
				toggled += (char) (z);
			}

		}
		return toggled;

	}

}
