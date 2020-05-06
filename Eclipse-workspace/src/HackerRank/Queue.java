package HackerRank;

import java.util.NoSuchElementException;

class arrayQueue {
	protected int Queue[];
	protected int front, rear, size, len;

	public arrayQueue(int n) {
		size = n;
		len = 0;
		Queue = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	public int getSize() {
		return len;
	}

	public void insert(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			Queue[rear] = i;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size) {
			Queue[++rear] = i;
			len++;
		}
	}

	public int remove() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int ele = Queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return ele;
		}
	}

	public void display() {
		if (len == 0) {
			System.out.println("Empty \n");
			return;
		}
		for (int i = front; i <= rear; i++)
			System.out.println(Queue[i] + "");
		System.out.println();
	}
}

public class Queue {

	public static void main(String[] args) {
		int s = 5;
		arrayQueue q = new arrayQueue(s);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.display();
		System.out.println(q.isEmpty());
		q.remove();
		q.display();

	}

}
