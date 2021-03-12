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
<<<<<<< HEAD
		int j = arr.length-1;
		while(i<=j) {
=======
		int j = arr.length - 1;
		while (i <= j) {
>>>>>>> 33de7bcf70182756d6ed9ab6cb8eb07e3e43d479
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