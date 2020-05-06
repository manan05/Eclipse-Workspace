package L11_Mar10;

public class LInkedListCLient {

	public static void main(String[] args) throws Exception {
		LinkedList l = new LinkedList();
//		System.out.println(l.isEmpty());
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
//		l.display();
		l.addFirst(100);
//		l.display();
//		System.out.println();
//		System.out.println(l.size());
//		System.out.println(l.isEmpty());
		l.addAt(65, 3);
		l.display();
		l.removeFirst();
		l.display();
		l.removeLast();
		l.display();
		l.removeAt(3);
		l.display();
	}

}
