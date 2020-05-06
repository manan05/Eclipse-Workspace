package L11_March10;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class LinkedListClient {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);

		// list.display();
		// list.addAt(100, 2);
		// list.display();
		// list.removeFirst();
		// list.display();
		// list.removeLast();
		// list.display();
		// list.removeAt(2);
		// list.display();
		// System.out.println(list.size());
		// list.display();
		// list.ReverseDR();
		// list.display();
		// list.fold();
		// list.display();
		// System.out.println(list.kthFromLast(3));
		// System.out.println(list.mid());
		LinkedList two = new LinkedList();
		// two.addLast(5);
		// two.addLast(15);
		// two.addLast(25);
		// two.addLast(35);
		// two.addLast(45);
		// two.addLast(55);
		LinkedList n = new LinkedList();
		// n=list.Merge2SortedLL(two);
		n.display();
		n.addLast(60);
		n.addLast(2);
		n.addLast(3);
		n.addLast(6);
		n.addLast(10);
		n.addLast(20);
		n.kReverse(3);
		n.display();
	}

}
