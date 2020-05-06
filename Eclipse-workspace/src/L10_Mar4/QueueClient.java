package L10_Mar4;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		// System.out.println(q.size());
		// System.out.println(q.getFirst());
		// System.out.println(q.dequeue());
		Actualreverse(q);
		System.out.println("=============");
		q.display();
		System.out.println("=============");
		DisplayReverse(q, 0);
		System.out.println("=============");
		q.display();
	}

	// L15_MARCH24

	public static void Actualreverse(Queue q) throws Exception {
		if (q.size()==0) {
			return;
		}
		int temp = q.dequeue();
		Actualreverse(q);
		q.enqueue(temp);

	}

	public static void DisplayReverse(Queue q, int count) throws Exception {
		if (count == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		DisplayReverse(q, count + 1);
		System.out.println(temp);
	}

	
	
}
