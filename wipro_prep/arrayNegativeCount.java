package wipro_prep;

import java.util.Scanner;

public class arrayNegativeCount {
	public static int arrayNegativeCountPrint(int[] arr) {
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < 0) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0; i <n;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(arrayNegativeCountPrint(arr));
	}
}

