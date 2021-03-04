package wipro_prep;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		reverse(str);
	}

	public static void reverse(String str) {
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (char ch : arr) {
			System.out.print(ch);
		}
	}
}
