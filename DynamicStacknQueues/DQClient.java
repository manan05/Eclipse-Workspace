/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 10-Jul-2020
 */
package DynamicStacknQueues;

public class DQClient {

	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.dequeue();
		dq.dequeue();
		dq.enqueue(60);
		
		dq.display();

	}

}
