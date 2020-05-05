package Stack;

public class Stack {
	int tos;
	int[] data;

	// default constructor
	// which in turn calls the parameterized constructor
	public Stack() {
		this(5); // used to call the other constructor within another constructor
	}

	// Parameterized constructor
	// would create more confusion for the user
	public Stack(int cap) {
		this.tos = -1;
		this.data = new int[cap];
	}

	// this operation pushes the item into the stack
	public void push(int item) {
		this.tos++; // increments tos first b/c initially it is -1
		this.data[this.tos] = item;
	}

	// this operation pops the item on tos
	public int pop() {
		int re = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return re;
	}
}
