/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 02-Jul-2020
 */
package LinkedList;

public class LinkedListClient {
	
	public static void main(String[] args) throws Exception {
		
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addFirst(60);
		list.addFirst(70);
		list.display();
		System.out.println(list.size());
		System.out.println(list.getAt(5));
		list.addAt(100, 2);
		list.display();
		System.out.println(list.removeFirst());
		list.display();

	}
}
