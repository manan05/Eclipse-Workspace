package Practice_HB_lec2;

import java.util.Scanner;

public class InverseArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
//		int arr[] = new int[N];
//		int arr2[] = new int[N];
//		int ab[] = input(N, arr);
//		int bc[] = input(N,arr2);
//		int z[] = inverse(ab);
//		System.out.println(display(bc, z));
	}

	public static int[] input(int N, int arr[]) {
		int i = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int[] inverse(int[] ab) {
		int[] inv = new int[ab.length];
		for (int i = 0; i < ab.length; i++) {
			inv[ab[i]] = i;
		}
		return inv;
	}

//	public static boolean display(int[] arr, int[] arr2) {
//		{	int flag = 0;
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] != arr2[i]) {
//					flag = 1;
//
//				}
//			}if (flag ==1){
//				return false;
//			}else{
//				return true;
//			}
//		}
//	}
}