package L10_Mar4;

public class StackClient {

	public static void main(String[] args) throws Exception {
		Stack abc = new Stack();
		Stack h = new Stack();
		abc.push(10);
		abc.push(20);
		abc.push(30);
		abc.push(40);
		// abc.display();
		// System.out.println(abc.pop());
		abc.display();
		// abc.pop();
		// abc.pop();
		// abc.pop();

		// System.out.println(abc.size());
		// System.out.println(abc.top());

		// displayReverse(abc);
		actualReverse(abc, h);
		abc.display();
	}

	// L14 March 18
	public static void displayReverse(Stack abc) throws Exception {
		if (abc.size() == 0) {

			return;
		}
		int ch = abc.pop();
		displayReverse(abc);
		System.out.println(ch);
		abc.push(ch);

	}

	public static void actualReverse(Stack abc, Stack h) throws Exception {
		if (abc.size() == 0) {
			if (h.size() == 0)
				return;
			int temp = h.pop();
			actualReverse(abc, h);
			abc.push(temp);
			return;
		}

		int ch = abc.pop();
		h.push(ch);
		actualReverse(abc, h);

	}

}
