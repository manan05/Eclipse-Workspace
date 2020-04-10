package L3_Feb10;

import java.util.Scanner;

public class checkUpperorLower {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.nextLine().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPERCASE");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowecase");
		} else {
			System.out.println("invalid");
		}

	}

}
