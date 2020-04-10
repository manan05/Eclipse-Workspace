package L6_Feb18;

import java.util.Scanner;

public class Stringops {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
//		System.out.println();
	boolean m = palindrome(str);
	System.out.println(m);
	}
	public static void printchars(String str){
		for (int i = 0; i <str.length();i++){
			System.out.println(str.charAt(i));
		}
	}
	public static boolean palindrome(String str){
		String abc = "";
		int flag = 0;
		for (int i = 0, j = str.length()-1; i <str.length()-1 && j>=0;i++,j--){
			if(str.charAt(i) != str.charAt(j)){
				flag = 1 ;
			}
		}if (flag == 1){
			return false;
		}else{
			return true;
		}
	}
}
