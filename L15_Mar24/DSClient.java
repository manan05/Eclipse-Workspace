package L15_Mar24;

import L10_Mar4.Stack;

public class DSClient {

	public static void main(String[] args) throws Exception {

		Dynamic_stack ds = new Dynamic_stack();
		 ds.push(10);
		 ds.push(20);
		 ds.push(30);
		 ds.push(40);
		 ds.push(50);
		 ds.push(60);
		 ds.push(70);
		 ds.display();
		int[] price = { 6, 3, 10, 8, 7, 12, 5, 4, 11, 9 };
		int [] z = stock(price);
		for (int i:z){
			System.out.println(i);
		}

	}

	public static int[] stock(int[] price) throws Exception {
		Stack s = new Stack(price.length);
		int[] span = new int[price.length];
		s.push(0);
		span[0] = 1;

		for (int i = 1; i < price.length; i++) {
			while (s.size() != 0 && price[i] < price[s.top()]) {

				s.pop();

			}
			if (s.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.top();
			}
			s.push(i);
		}

		return span;
	}

}
