/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 10-Jul-2020
 */
package DynamicStacknQueues;

import Queue.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			// new logic to increase the size of the queue

			// capture old queue
			int[] oldQueue = this.data;

			// create new queue with twice the size of oldQueue
			int[] newQueue = new int[2 * oldQueue.length];

			// copy data of oldQueue to newQueue
			for (int i = 0; i < this.size; i++) {
				int idx = (i + front) % this.data.length;
				newQueue[i] = oldQueue[idx];
			}
			
			// point the data array(queue) to the newQueue
			this.data = newQueue;
			this.front = 0;
		}
		
		// push the new element into the queue
		super.enqueue(item);
	}
}
