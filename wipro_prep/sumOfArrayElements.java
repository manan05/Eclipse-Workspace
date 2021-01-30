package wipro_prep;

import java.util.Scanner;

public class sumOfArrayElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = scn.nextInt();
		}
		sumArr(arr);
	}
	public static void sumArr(int[] arr) {
		
		for(int i = 0; i<arr.length;i++) {
			int sum = 0;
			int num = arr[i];
			while(num!=0) {
				int rem = num%10;
				sum = sum + rem;
				num = num/10;
			}
			System.out.print(sum + " ");
		}
		
	}

}
