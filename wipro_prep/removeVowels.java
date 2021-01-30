package wipro_prep;

import java.util.Scanner;

public class removeVowels {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
//		char[] arr = str.toCharArray();
		remove(str);
	}
	public static void remove(String str) {
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i'|| str.charAt(i)== 'o'|| str.charAt(i)== 'u') {
				continue;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}

}
