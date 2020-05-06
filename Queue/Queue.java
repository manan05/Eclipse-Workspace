package Queue;

public class Queue {
	private int front;
	private int size;
	private int[] data;

	// Parameterized constructor
	public Queue(int cap) {
		this.front = 0;
		this.size = 0;
		this.data = new int[cap]; // creating a new array with cap as capacity
	}

	// Default constructor
	public Queue() {
		this(5); // calling the parameterized constructor for value 5
	}

	// This method adds elements to the queue
	public void enqueue(int item) throws Exception{
		
		if(this.data.length == this.size) {
			throw new Exception("Queue is Full!");
		}
		
		// ni = new index
		int ni = (this.front + this.size) % this.data.length; // to make the queue circular
		this.data[ni] = item;
		this.size++;
	}

	// This method removes element from the queue and displays that elem
	public int dequeue() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		
		int rv = this.data[this.front]; // rv = return value
		this.data[this.front] = 0; // set the front value as 0
		this.front = (this.front + 1) % this.data.length; // to make dequeue circular
		this.size--;
		return rv;
	}

	// This method returns the first element of the queue
	public int getFirst() throws Exception { 
		
		if(this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		
		int rv = this.data[this.front]; // rv = return value
		return rv;
	}

	// This method returns the size of the queue
	public int size() {
		return this.size;
	}

	// This method returns whether the queue is empty or not
	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println("**********************");
		for (int i = 0; i < this.data.length; i++) {
			int idx = (i + this.front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println();
		System.out.println("**********************");
	}
}
