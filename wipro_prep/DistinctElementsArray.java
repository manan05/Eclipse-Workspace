package wipro_prep;

import java.util.Arrays;
import java.util.Scanner;


public class DistinctElementsArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n;i++ ) {
			arr[i] = scn.nextInt();
		}
		distinctArrayElems(arr);
		printArray(arr);
	}
	public static void distinctArrayElems(int[] arr) {
		int count = 1;
		Arrays.sort(arr); // now array sorted
		for(int i =0; i<arr.length -1; i++) {
			if(arr[i] != arr[i+1]) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
	public static void printArray(int[] arr){
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
