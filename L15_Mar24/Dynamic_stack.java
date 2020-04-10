package L15_Mar24;

import L10_Mar4.Stack;

public class Dynamic_stack extends Stack {

	public static void main(String[] args) {

	}

	@Override
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] os = this.data;
			int[] ns = new int[2 * this.size()];

			for (int i = 0; i < this.size(); i++) {
				ns[i] = os[i];
			}

			this.data = ns;
		}
		super.push(item);
	}

}
