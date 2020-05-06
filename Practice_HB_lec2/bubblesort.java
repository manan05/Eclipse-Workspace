package Practice_HB_lec2;

import java.util.Scanner;

public class bubblesort {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scn.nextInt();
		int arr[] = new int[N];
		int ab[] = input(N,arr);
	    display(bubblesort(ab));


	}public static int[] bubblesort(int[] arr) {
		for (int c = 0; c < arr.length - 1; c++) {
			// System.out.println("Counter" + c + ":");
			for (int j = 0; j < arr.length - 1 - c; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}return arr;
	}public static int[] input(int N, int arr[]){
		int i = 0;
		for (i = 0; i<= arr.length - 1;i++){
			arr[i] = scn.nextInt();
		}return arr;
	}public static void display(int[] arr) {
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}


}
