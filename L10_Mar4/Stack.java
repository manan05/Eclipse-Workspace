package L10_Mar4;

public class Stack {
	public int tos;
	public int[] data;

	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		tos = -1;
		data = new int[cap];
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is Full.");
		}this.tos++;
		this.data[this.tos] = item;
		

	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty,");
		}
		int ret = this.data[tos];
		this.tos--;
		return ret;
	}

	public int top() throws Exception {
		if (this.size()==  0) {
			throw new Exception("Stack is Empty.");
		}

		return this.data[this.tos];
	}

	public int size() throws Exception {
		return this.tos + 1;
	}

	public void display() throws Exception {
		for (int i = this.tos ; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
	}
}
