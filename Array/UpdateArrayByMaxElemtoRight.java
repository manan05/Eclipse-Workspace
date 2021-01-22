/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 04-Sep-2020
 */
package Array;

public class UpdateArrayByMaxElemtoRight {

	// Given an array having N elements, for each index i, we have to update the array
	// by its max element in the right.
	// e.g-  I/P- [6, 7, 11, 4, 10, 8] ,    O/P- [11, 11, 11, 10, 10, 8]
	public static void main(String[] args) {
		int[] arr = {6,7,11,4,10,8};
		int[] ans = updateByMaxElemToRight(arr);
		display(ans);
	}

	public static int[] updateByMaxElemToRight(int[] arr) {
		int maxArr = arr[0];
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					maxArr = arr[j];
				}
				arr[i] = maxArr;
			}
			
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
