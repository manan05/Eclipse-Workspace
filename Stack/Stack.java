package Stack;

public class Stack {
	private int tos;
	public int[] data;

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
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full;");
		}

		this.tos++; // increments tos first b/c initially it is -1
		this.data[this.tos] = item;
	}

	// this operation pops the item from the stack
	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty;");
		}

		int re = this.data[this.tos]; // saving the element on tos
		this.data[this.tos] = 0; // making the elem on tos as 0
		this.tos--; // decrementing tos
		return re;
	}

	// this operation returns the element on top of the stack
	public int top() throws Exception {
		if(this.size() == 0) {
			throw new Exception("Stack is Empty;");
		}
		
		int re = this.data[this.tos];
		return re;
	}

	// this operation returns the size of the stack
	public int size() {
		return this.tos + 1;
	}

	// this operation returns true or false if the stack is empty or not
	public boolean isEmpty() {
		return (this.size() == 0);
	}
	
	// this operation is used to display the stack
	public void display() {
		
		System.out.println("************************");
		for(int i = this.tos; i>=0;i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
		System.out.println("************************");
	}
}
