package Tcs_prep;

import java.util.Scanner;

public class CeasarCipher_prepInsta {
//	take multiple inputs in  a line
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String mess = scn.nextLine(); // String to cipher
		int key = scn.nextInt(); // key
		CustomCaesarCipher(key, mess);
	}

	public static void CustomCaesarCipher(int key, String mess) {
		char[] myMess = mess.toCharArray();
		if(key <0 && key > 9) {
			System.out.println("Invalid Input");
		}
		for(int i = 0; i<myMess.length; i++) {
			
		}
	}
}
