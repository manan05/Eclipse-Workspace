package Practice_HB_lec2;

import java.util.Scanner;

public class Contained_in_an_array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = scn.nextInt();
		int arr[] = new int[N];
		int arr2[] = input(arr);
		int m = scn.nextInt();
		System.out.println(contained(arr2, m));
		

	}
	public static int[] input(int arr[]){
		for(int i = 0; i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static boolean contained(int arr[], int m){
		for(int i = 0; i<arr.length; i++){
			if (arr[i] == m){
				return true;
			}
		}
		return false;
	}

}
