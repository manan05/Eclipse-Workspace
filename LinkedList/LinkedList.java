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
	public int getAt(int idx) throws Exception{
		if(idx <0 || idx > this.size){
			throw new Exception("Index is invalid.");
		}
		Node temp = this.head;
		for(int i = 0; i<idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

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
		}

	}

}
