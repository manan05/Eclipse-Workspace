package wipro_prep;

import java.util.Scanner;
import java.util.Arrays;

public class sortFirstHalfAsc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		sort(arr);

	}
	public static void sort(int[] arr) {
		Arrays.sort(arr);
		for(int i= 0; i<(arr.length/2); i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = arr.length-1; i>=arr.length/2; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	

}
