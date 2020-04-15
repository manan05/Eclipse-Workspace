package Array;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		// output = [] empty array
//		System.out.println(list.size());
//		// 0 because no element.
//		list.add(10);
//		System.out.println(list);
//		// [10]
//		System.out.println(list.size());
//		// 1
//		list.add(20);
//		System.out.println(list);
//		// [10,20]
//		System.out.println(list.size());
//		// 2
//		list.add(30);
//		System.out.println(list);
//		// [10,20,30]
//		System.out.println(list.size());
//		// 3

		int[] one = { 10, 10, 20, 40, 40, 50, 50 };
		int[] two = { 10, 10, 10, 30, 40, 50, 50, 50, 60, 60 };
//		System.out.println(Intersection(one, two));

		int[] a = { 8, 6, 7, 5 };
		int[] b = { 9, 5, 4, 1, 9 };
//		System.out.println(sum(a, b));
		
		int[] arr012 = {0,2,1,2,0,1,2,1,1,0};
		System.out.println(sort012(arr012));

	}

	public static ArrayList<Integer> Intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < one.length && j < two.length;) {
			if (one[i] == two[j]) {
				ans.add(one[i]);
				i++;
				j++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				i++;
			}
		}
		return ans;

	}

	public static ArrayList<Integer> sum(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = one.length - 1; // i = last element of one
		int j = two.length - 1; // j = last element of two
		int carry = 0; // initially 0
		while (i >= 0 || j >= 0) {
			int sum = carry; // initially making sum as carry
			if (i >= 0) // so that if i ends and we still try to access element at -1
				sum += one[i];
			if (j >= 0) // so that if j ends and we still try to access element at -1
				sum += two[j];
			int rem = sum % 10;
			ans.add(0, rem); // otherwise remainder will add on back, but we want it on front
			carry = sum / 10;
			i--;
			j--;
		}
		if (carry != 0) { // if loop ends and there is still carry left, we add carry at the start
			ans.add(0, carry);
		}

		return ans;
	}

	public static ArrayList<Integer> sort012(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				ans.add(0,arr[i]);
				count++;
			}
			if(arr[i] ==1) {
				ans.add(count,arr[i]);
			}
			if(arr[i] == 2) {
				ans.add(arr[i]);
			}
			
		}
		return ans;
	}

}
