package Practice_HB_lec2;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(toggle(s));

	}

	public static String toggle(String sentence) {
		String toggled = "";
		for (int i = 0; i < sentence.length(); i++) {

			char letter = sentence.charAt(i);

			if (Character.isUpperCase(sentence.charAt(i))) {
				letter = Character.toLowerCase(letter);
				toggled = toggled + letter;

			} else if (Character.isLowerCase(sentence.charAt(i))) {
				letter = Character.toUpperCase(letter);
				toggled = toggled + letter;
			}

		}
		return toggled;

	}
}
