package wipro_prep;

import java.util.Scanner;

public class removeVowels {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] arr = str.toCharArray();
		remove(arr);
	}
	public static void remove(char[] arr) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != 'a' || arr[i] != 'e'|| arr[i] != 'i' || arr[i] != 'o'|| arr[i] != 'u') {
				System.out.print(arr[i]);
			}
		}
	}

}
