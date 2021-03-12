package wipro_prep;
import java.util.*;
import java.util.Scanner;

public class reverseString{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		String ans = String.valueOf(arr);
		return ans;
	}
}