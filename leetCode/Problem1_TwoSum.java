package leetCode;

import java.util.Scanner;

// #1 Two Sum
// Link = https://leetcode.com/problems/two-sum/

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1].

public class Problem1_TwoSum {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i<n;i++) {
			nums[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int[] ret = twoSum(nums, target);
		printArray(ret);
		
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for(int i = 0, j = 1; i<nums.length && j<nums.length; i++,j++) {
			if(nums[i]+nums[j] == target) {
				ans[0] = i;
				ans[1] = j;
			}
		}
		return ans;
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
	}

}
