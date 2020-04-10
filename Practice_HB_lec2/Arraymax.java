package Practice_HB_lec2;

import java.util.Scanner;

public class Arraymax {
	static Scanner scn = new Scanner (System.in);
	public static void main(String[] args) {
		
		int N = scn.nextInt();
		int arr [] = new int[N];
		int[] arr1 =input(arr);
		System.out.println(maximum(arr1));

	}public static int[] input(int arr[]){
		for(int i = 0; i <= arr.length-1;i++){
			arr[i] = scn.nextInt();
		}return arr;
	}public static int maximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}


}
