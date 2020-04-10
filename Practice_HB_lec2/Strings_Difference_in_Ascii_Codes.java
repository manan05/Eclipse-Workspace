package Practice_HB_lec2;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scn.next();
		System.out.println(zedd(s));

	}

	public static String zedd(String s) {
		char m = s.charAt(s.length()-1);
		String ans = "";
		for (int i = 0,j=i+1; i < s.length()-1 || j<s.length(); i++,j++) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			int diff = (int) ((int) (b) - (int) (a));
			ans += a;
			ans += diff;
			
		}
		ans+=m;
		return ans;
	}

}
