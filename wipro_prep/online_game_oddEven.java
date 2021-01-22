package wipro_prep;

import java.util.Scanner;

public class online_game_oddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		printArray(arr);
		arrangeOddEven(arr);
		printArray(arr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static void arrangeOddEven(int[] arr) {
		int front = 0;
		int end = arr.length - 1;
		while (front < end) {
			if (arr[front] % 2 != 0) { // if elem at front odd;
				if (arr[end] % 2 == 0) { // if elem at end even;
					int temp = arr[front];
					arr[front] = arr[end];
					arr[end] = temp;
					front++;
					end--;
				} else { // if elem at back is odd;
					end--;
				}
			} else { // if elem at front is even;
				front++;
			}
		}

	}
}
