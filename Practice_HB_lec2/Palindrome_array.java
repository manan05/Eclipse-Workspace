package Practice_HB_lec2;

import java.util.Scanner;

public class Palindrome_array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int arr2[] = input(arr);
		System.out.println(is_palidrome(arr2));
		

	}
	public static int[] input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static boolean is_palidrome(int[] arr){
		boolean ans = true;
		for ( int i = 0; i<arr.length/2;i++){
			if(arr[i] != arr[arr.length - i-1]){
				ans = false;
			}
		}
		return ans;
	}

}
