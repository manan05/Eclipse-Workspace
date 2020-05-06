package Array;

import java.util.Scanner;

//- take input done
//- display array	done
//- max of an array	done 
//- reverse of an array	done
//- rotate an array
//- inverse of array
//- linear search
//- binary search
//- bubble sort 
//- selection sort
//- insertion sort
public class ArrayDifferentFunc {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// HardCoded Array
		int[] arr = { 10, 20, 30, 40, 50, 80 };

		int[] arr1 = { 30, 50, 10, 60, 20, 40, 80 };

		// size of array input
		// - Array (Input)
//		System.out.println("Size ?");
//		int n = scn.nextInt();
//		int[] array1 = input(n); // because return type is int of input
//		System.out.println(array1); // address of array will be printed

		// Display(array)
//		display(array1);

		// Max of an array
//		System.out.println(max(arr));

		// Reverse of an array
//		int[] a = reverse(arr);
//		display(a);

		// - Rotate an array
//		int[] a = rotate(arr, 1); // right side rotation
//		display(a);

		// - Linearsearch of an array
//		System.out.println(linearSearch(arr, 50));

		// - Binary Search in an array
		// Binary Search is only applicable for sorted arrays
//		System.out.println(binarySearch(arr, 20));

		// - BubbleSorting
//		System.out.println("Before Bubble Sort");
//		display(arr1);
//		bubbleSort(arr1);
//		System.out.println("After bubble sort");
//		display(arr1);

		// -BubbleSortingOptimization
//		System.out.println("Before sorting");
//		display(arr1);
//		System.out.println("After sorting");
//		bubbleSortOptimized(arr1);
//		display(arr1);

		// - Selection Sort
//		System.out.println("Before Selection sort");
//		display(arr1);
//		selectionSort(arr1);
//		System.out.println("After sorting");
//		display(arr1);
		
//		//- Insertion Sort
//		display(arr1);
//		insertionSort(arr1);
//		System.out.println("After Sorting");
//		display(arr1);
		
	}

	// - Take input in array
	public static int[] input(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	// - Display an array
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// - Max of an array
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE; // initially set to the minimum value of integer
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) { // this will be true for the first time bc every num > min integer
				max = arr[i]; // swap
			}
		}
		return max;

	}

	// - Reverse of an array
	public static int[] reverse(int[] arr) {
		int fp = 0; // front pointer
		int bp = arr.length - 1; // back pointer
		for (; fp < arr.length / 2; fp++, bp--) {
			int temp = arr[fp];
			arr[fp] = arr[bp];
			arr[bp] = temp;
		}
		return arr;
	}

	// - Rotate an array
	public static int[] rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < rot) {
				ans[i] = arr[i + ans.length - rot];
			} else {
				ans[i] = arr[i - rot];
			}
		}
		return ans;

	}

	// - Linear Search
	public static int linearSearch(int[] arr, int elem) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elem) {
				return i;
			}
		}
		return -1;
	}

	// - BinarySearch
	// Only works for sorted arrays

	public static int binarySearch(int[] arr, int elem) {
		int front = 0;
		int back = arr.length - 1;
		while (front <= back) {
			int mid = (front + back) / 2;
			if (elem < arr[mid]) {
				back = mid - 1;
			} else if (elem > arr[mid]) {
				front = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// SORTING
	// BubbleSort

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	// if the array is already sorted, then there is no need
	// to traverse the array for every element
	public static int[] bubbleSortOptimized(int[] arr) {
		boolean swap;
		for (int i = 0; i < arr.length - 1; i++) {
			swap = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false) {
				break;
			}
		}
		return arr;

	}

	// Selection Sort

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (arr[min_idx] > arr[j]) {
					min_idx = j;
				}
			}
			// swap minimum index elem with i'th element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	// Insertion Sort
	
	public static int[] insertionSort(int[] arr) {
		for(int i = 1;i<arr.length-1;i++) {
			int val = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
		}
		return arr;
	}    

}
