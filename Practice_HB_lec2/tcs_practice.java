package Practice_HB_lec2;

import java.util.Scanner;

public class tcs_practice {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println('A' + 'B'); // output = 131
//
//		char[] str = { 'i', 'n', 'c', 'l', 'u', 'd', 'e', 'h', 'e', 'l', 'p' };
//		System.out.println(str.toString()); // address where str is stored
//
//		byte x = 12;
//		byte y = 13;
//		byte result = (byte) (x + y);
//		System.out.println(result);
//		int i = 5;
//		int j = 4;
//		System.out.println(i + "," + j);
//		i = i + j;
//		j = i - j;
//		i = i - j;
//		System.out.println(i + "," + j);
//		int arr[] = new int[10];
//		for (int k = 0; k < 5; k++) {
//			arr[k] = k;
//		}
//		for(int j1 : arr) {
//			System.out.println(j1);
//		}
		binarySearch();

	}

	public static void binarySearch() {
		int arr[] = { 10, 20, 30, 40, 50, 60, 80, 100, 120 };
		int elem = scn.nextInt();
		int flag = 0;
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == elem) {
				flag = 1;
				break;
			} else if (arr[mid] > elem) {
				r = mid-1;
			} else {
				l = mid +1;
			}
		}
		if (flag == 0)
			System.out.println("Not found");
		else 
			System.out.println("FOund");
	}

}
