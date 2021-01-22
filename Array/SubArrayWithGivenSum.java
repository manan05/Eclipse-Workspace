/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 23-Aug-2020
 */
package Array;

// Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a 
// given number.

// simple approach:
//1. Traverse the array from start to end.
//2. From every index start another loop from i to the end of the array, keep a variable sum 
//   to calculate the sum
//3. For every index in inner loop update sum = sum + array[i]
//4. if the sum is equal to the target print the sub array.
public class SubArrayWithGivenSum {

	public boolean subArraySum(int[] arr , int n, int sum) {
		int currentSum = 0;
		for(int i = 0; i<n;i++) {
			currentSum = arr[i];
			for(int j = i+1 ; j<n;j++) {
				if(currentSum == sum) {
					System.out.println("Found between " + i + " and " + (j-1));
					return true;
				}
				if(currentSum > sum || j == n) {
					break;
				}
				currentSum = currentSum + arr[j];
			}
		}
		System.out.println("Not found.");
		return false;
	}
	
	
	public static void main(String[] args) {
		
		SubArrayWithGivenSum ab = new SubArrayWithGivenSum();
		int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		int n = arr.length;
		int sum = 24;
		System.out.println(ab.subArraySum(arr, n, sum));
	}

}
