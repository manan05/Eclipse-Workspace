package DS;

import java.util.Scanner;

// Check Upper or Lower case character
public class CheckUpperLowerCase {
	public static void upperLower(char ch) {
		if(ch>='A' && ch<='Z') {
			System.out.print("UpperCase;");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("LowerCase;");
		}
		else{
			System.out.println("Invalid character;");
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.nextLine().charAt(0); //.charAt(0) as to check the case of first 
		// character
		upperLower(ch); // calling the function
	}
}
