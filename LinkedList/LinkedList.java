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

	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void addLast(int item) {
		
		// Create a new node
		Node newNode = new Node();
		
		// Update 
		newNode.data = item;
		newNode.next = null;
		
		// Attach
		
	}

}
