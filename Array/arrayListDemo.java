package Array;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		System.out.println(list);
		// output = [] empty array
		System.out.println(list.size());
		// 0 because no element.
		list.add(10);
		System.out.println(list);
		//[10]
		System.out.println(list.size());
		//1
		list.add(20);
		System.out.println(list);
		//[10,20]
		System.out.println(list.size());
		// 2 
		list.add(30);
		System.out.println(list);
		//[10,20,30]
		System.out.println(list.size());
		// 3
	}

}

