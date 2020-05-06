package Practice_HB_lec2;

import java.util.Scanner;

public class LinearSearchArray {
	static Scanner scn = new Scanner (System.in);
	public static void main(String[] args) {
	
	int N = scn.nextInt();
	int arr[] = new int[N];
	int ab[] = input(N,arr);
	int number = scn.nextInt();
	System.out.println(linearsearch(number,ab));

	}public static int[] input(int N, int arr[]){
		int i = 0;
		for (i = 0; i<= arr.length - 1;i++){
			arr[i] = scn.nextInt();
		}return arr;
	}public static int linearsearch(int number,int ab[]){
		int temp = number;
		for(int i = 0; i<=ab.length-1; i++){
			if (ab[i] == number){
				return i;
			}
		}return -1;
	}

}
