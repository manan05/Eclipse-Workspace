package Queue;

public class QueueClient {

<<<<<<< HEAD
	public static void main(String[] args) {
		

=======
	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
//		q.enqueue(60);
		q.display();
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getFirst());
		q.enqueue(60);
		q.enqueue(70);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.display();
		q.dequeue();
	}

}
