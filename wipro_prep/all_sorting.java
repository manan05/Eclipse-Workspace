package wipro_prep;

import java.util.Scanner;

public class all_sorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Size of array;");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		printArray(arr);
//		selectionSort(arr);
//		bubbleSort(arr);
		insertionSort(arr);
		System.out.println();
		printArray(arr);

	}
	// Print array
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}
	// Selection sorting
	public static void selectionSort(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			int min_idx = i;
			for (int j = i+1; j<arr.length ; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}

}