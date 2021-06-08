package accentureCodingQuestions;

import java.util.Scanner;

public class maxArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {23,45,82,27,66,12,78,13,71,86};
		maxInArray(arr);
	}
	public static void maxInArray(int[] arr) {
		int maxElem = arr[0];
		int maxIdx = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]> maxElem) {
				maxElem = arr[i];
				maxIdx = i;
			}
		}
		System.out.println(maxElem);
		System.out.println(maxIdx);
	}

}
