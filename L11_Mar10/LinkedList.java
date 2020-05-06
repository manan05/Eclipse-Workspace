package L11_Mar10;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	public Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void addLast(int item) {
		// create
		Node nn = new Node();

		// update
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size > 0) {
			this.tail.next = nn;
		}

		// summary_update
		if (this.size == 0) {
			this.tail = nn;
			this.head = nn;
			this.size++;

		} else {
			this.tail = nn;
			this.size++;

		}
	}

	public void display() {
		Node temp = this.head;
		System.out.println("----------------------------");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.print("----------------------------");
	}

	public void addFirst(int item) {
		// create
		Node nn = new Node();

		// update
		nn.data = item;
		nn.next = null;

		// attach

		nn.next = this.head;
		// summary_update
		if (this.size == 0) {
			this.tail = nn;
			this.head = nn;
			this.size++;

		} else {
			this.head = nn;
			this.size++;

		}
	}

	public void addAt(int item, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index");
		}
		if (idx == 0) {
			addFirst(item);
		}
		if (idx == this.size) {
			addLast(item);
		} else {
			// create
			Node nn = new Node();

			// update
			nn.data = item;
			nn.next = null;

			// attach

			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;
			nm1.next = nn;
			nn.next = np1;

			// summary update
			this.size++;

		}
	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Empty LL");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Empty LL");
		}
		return this.tail.data;
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		Node temp = this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;

		}
		return temp.data;
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		Node temp = this.tail;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getNodeAt(this.size - 2);
			this.tail = sm2;
			this.tail.next = null;
			this.size--;
		}
		return temp.data;
	}

	public int removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}if (idx < 0 || idx >= this.size){
			throw new Exception("Invalid Index");
		}
		Node temp = this.tail;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}else{
			Node nm1 = getNodeAt(idx-1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size --;

		}return temp.data;
	}
}
