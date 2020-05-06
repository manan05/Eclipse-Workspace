package L10_Mar4;

public class Queue {
	protected int front;
	protected int size = 0;
	protected int[] data;

	public Queue() {
		this(5);
	}

	public Queue(int cap) {
		this.front = 0;
		this.size = 0;
		this.data = new int[cap];
	}

	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			throw new Exception("Queue is Full.");
		}
		int ni = (this.front + this.size) % this.data.length;
		this.data[ni] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty.");
		}
		int rv = this.data[front];
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;

	}

	public int getFirst() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		return this.data[front];
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {

		for (int i = 0; i < this.size; i++) {
			int id = (i + this.front) % this.data.length;
			System.out.println(this.data[id]);
		}
	}
}
