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

	//This method adds elements to the queue
	public void enqueue(int item) {
		if()
		
		int ni = (this.front + this.size) % this.data.length; //to make the queue circular
		this.data[ni] = item; 
		this.size++;
	}

}
