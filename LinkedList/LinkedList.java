/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 01-Jul-2020
 */
package LinkedList;

public class LinkedList {

	// Creating a private Node class so that client cannot
	// access it.
	private class Node {
		int data; // data of the node
		Node next; // address of the next node
	}

	// Properties of the LL
	private Node head; // points at the first node of the LL
	private Node tail; // points at the last node of the LL
	private int size;

	// returns the size of the LL
	public int size() {
		return this.size;
	}

	// returns t/f if LL is empty or not
	public boolean isEmpty() {
		return this.size == 0;
	}

	// adds an item to the LL at last of the LL
	// Complexity = O(1)
	public void addLast(int item) {

		// Create a new node
		Node newNode = new Node();

		// Update
		newNode.data = item;
		newNode.next = null;

		// Attach
		// if head = tail = null then use this condition
		if (this.size > 0)
			this.tail.next = newNode;

		// Summary update
		// because updated at last (added value)
		// so head doesn't change but tail does

		// initially if adding first item, head and tail both are null so
		// assigning them both to newNode
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		}

		// when we add new nodes and size != 0
		else {
			this.tail = newNode;
			this.size++;
		}

	}

	// displays the LL
	// Complexity = O(n)
	public void display() {

		System.out.println("-------------------------");

		// creating temporary node that points to the head of the LL
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next; // becomes null only when at tail
		}
		System.out.println(".");
		System.out.println("-------------------------");
	}

	// adds an item at the first of the LL
	// Complexity = O(1)
	public void addFirst(int item) {
		// new Node
		Node newNode = new Node();

		// update
		newNode.data = item;
		newNode.next = null;

		// attach

		newNode.next = this.head;

		// update summary

		// because by now list is empty
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		} else {
			this.head = newNode;
			this.size++;
		}

	}

	// returns the item at a given index of the LL
	// Complexity = O(n)
	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}

		if (idx < 0 || idx > this.size) {
			throw new Exception("Index is invalid.");
		}
		// making a temp node that points to the head of the LL
		Node temp = this.head;
		// loop till idx and at the end of loop value will be the required value
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	// returns the node at the given index of the LL
	// Complexity = O(n)
	private Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Index is invalid.");
		}

		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// Adds an element item at a given idx
	// Complexity = O(n)
	public void addAt(int item, int idx) throws Exception {
		// adding exception for invalid index
		if (idx < 0 || idx > size) {
			throw new Exception("Index is invalid.");
		}

		// because we have already created addFirst
		if (idx == 0) {
			addFirst(item);
		}
		// because we have already created addLast
		else if (idx == this.size) {
			addLast(item);
		} else {
			// new Node
			Node newNode = new Node();

			// update
			newNode.data = item;
			newNode.next = null;

			// attach
			Node nodeMinus1 = getNodeAt(idx - 1);
			Node nodePlus1 = getNodeAt(idx);

			nodeMinus1.next = newNode;
			newNode.next = nodePlus1;

			this.size++;
		}

	}

	// Complexity = O(1)
	// returns the item kept at first place (head)
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		return this.head.data;
	}

	// returns the item kept at last place (tail)
	// Complexity = O(1)
	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		return this.tail.data;
	}

	// removes the first element and returns its data
	// Complexity = o(1)
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		Node temp = this.head;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = temp.next;
			this.size--;
		}
		return temp.data;
	}

	// removes the last element and returns its data
	// Complexity = O(1)
	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}

		Node temp = this.tail;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizeMinus2 = getNodeAt(this.size - 2);
			this.tail = sizeMinus2;
			this.tail.next = null;

		}
		return temp.data;

	}
	

	// removes the element at an idx and returns its data
	// Complexity = O(n)
	public int removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Index is invalid.");
		}

		if (idx == 0) {
			return this.removeFirst();
		}

		else if (idx == this.size - 1) {
			return this.removeLast();
		} else {
			Node nodeMinus1 = getNodeAt(idx - 1);
			Node nodePlus1 = getNodeAt(idx + 1);
			Node node = getNodeAt(idx);

			nodeMinus1.next = nodePlus1;
			this.size --;
			
			
			return node.data;

		}

	}
}
