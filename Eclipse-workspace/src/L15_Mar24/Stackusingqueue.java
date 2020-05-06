package L15_Mar24;

public class Stackusingqueue {

	Dynamic_queue primaryQueue = new Dynamic_queue();
// Making push in order of 1
// but making pop in order of n;
	public void push(int item) throws Exception {

		try {
			primaryQueue.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}
	}

	public int pop() throws Exception {

		try {
			Dynamic_queue helperQueue = new Dynamic_queue();

			while (primaryQueue.size() != 1) {
				int temp = primaryQueue.dequeue();
				helperQueue.enqueue(temp);
			}

			int rv = primaryQueue.dequeue();

			primaryQueue = helperQueue;

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}
	}

	public int top() throws Exception {

		try {
			Dynamic_queue helperQueue = new Dynamic_queue();

			while (primaryQueue.size() != 1) {
				int temp = primaryQueue.dequeue();
				helperQueue.enqueue(temp);
			}

			int rv = primaryQueue.dequeue();

			primaryQueue = helperQueue;
			primaryQueue.enqueue(rv);

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}
	}

	public int size() {
		return primaryQueue.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() throws Exception {

		displayH(0);
	}

	public void displayH(int count) throws Exception {

		if (count == primaryQueue.size()) {
			return;
		}

		int temp = primaryQueue.dequeue();
		primaryQueue.enqueue(temp);
		displayH(count + 1);
		System.out.println(temp);
	}

}
