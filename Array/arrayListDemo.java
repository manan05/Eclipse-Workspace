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
		
		int[] one = {10,10,20,40,40,50,50};
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
			}
			else {
				i++;
			}
		}
		return ans;

	}

}
