package Queue;

public class Queue {
	private int front;
	private int size;
	private int[] data;

	// Default constructor
	public Queue() {
		this.front = 0;
		this.size = 0;
		this.data = new int[5];
	}

	// Parameterized constructor
	public Queue(int cap) {

		this.front = 0;
		this.size = 0;
		this.data = new int[cap];
	}

	// Enqueue = used to insert elements in the queue
	public void enqueue(int item) throws Exception {
		if(this.size == this.data.length) {
			throw new Exception("Queue is full.");
		}
		// ni = new index
		int ni = (this.front + this.size) % this.data.length; // finding modulus to make the enqueue circular
		this.data[ni] = item;
		this.size++;
	}

	// Dequeue = used to delete elements in the queue
	public int dequeue() throws Exception{
		if(this.size == 0) {
			throw new Exception("Queue is Empty.");
		}
		// rv = return value
		int rv = this.data[this.front]; // storing front value in rv
		this.data[this.front] = 0; // modifying front to 0
		this.front = (this.front + 1) % this.data.length; // making the dequeue op circular
		this.size--;
		return rv;
	}

	// getFirst = Returns the first element of the queue
	public int getFirst() throws Exception{
		if(this.size == 0) {
			throw new Exception("Queue is Empty.");
		}
		
		// rv = return value
		int rv = this.data[this.front];
		return rv;
	}

	// size = Return the size of the queue
	public int size() {
		return this.size;
	}

	// isEmpty = Returns whether the queue is empty or not
	public boolean isEmpty() {
		return this.size == 0;
	}

	// display = Displays the queue
	public void display() {
		for (int i = 0; i < this.size; i++) {
			int idx = (i + this.front) % this.data.length;
			System.out.print(this.data[idx] + ", ");
		}
		System.out.println(" ");
		System.out.println("****************");
	}

}
