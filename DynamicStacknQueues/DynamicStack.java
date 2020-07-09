/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 10-Jul-2020
 */
package DynamicStacknQueues;

import Stack.Stack;

//We will only make a push function in dynamic stack
//For other functions, we will inherit them from the stack that we made previously 

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			// new logic to increase the size of stack

			// capture old stack
			int[] oldStack = this.data;

			// create new stack with twice the size of oldStack
			int[] newStack = new int[2 * oldStack.length];

			// copy data of oldStack to newStack
			for (int i = 0; i < oldStack.length; i++) {
				newStack[i] = oldStack[i];
			}

			// point the data array(stack) to the newStack
			this.data = newStack;

		}
		// push the new element to the newStack
		super.push(item);
	}
}
