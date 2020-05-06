package L15_Mar24;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		Dynamic_queue qs = new Dynamic_queue();
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		qs.display();
		System.out.println("=================");
		qs.dequeue();
		qs.dequeue();
		qs.enqueue(60);
		qs.enqueue(70);
		qs.display();
		qs.enqueue(80);
		System.out.println("+++++++++++++++++");
		qs.display();
		
	}

}
