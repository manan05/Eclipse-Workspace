package Stack;

public class Stack {
	private int tos;
	private int[] data;

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

	// this operation pops the item from the stack
	public int pop() {
		int re = this.data[this.tos]; // saving the element on tos
		this.data[this.tos] = 0; // making the elem on tos as 0
		this.tos--; // decrementing tos
		return re;
	}

	// this operation returns the element on top of the stack
	public int top() {
		int re = this.data[this.tos];
		return re;
	}
	
	//this operation returns the size of the stack
	public int size() {
		return this.tos + 1;
	}
}
