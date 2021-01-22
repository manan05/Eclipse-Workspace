/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 10-Jul-2020
 */
package DynamicStacknQueues;

import Stack.Stack;

public class StackSpanQuestion extends Stack{

	public static void main(String[] args) {
		int[] price = {6,3,10,8,7,12,5,4,11,9};

	}
	public static int[] stockSpan(int[] price) throws Exception {
		Stack stack = new Stack(price.length);
		
		// creating the output array
		int[] span = new int[price.length];
		
		// pushing 0 to the stack
		stack.push(0);
		
		// span of 1st elem will always be 1
		span[0] = 1;
		
		// till price length loop
		for(int i = 1; i< price.length; i++) {
			// price[i th] elem > price ke stack top waale element in price array
			while(!stack.isEmpty() && price[i] >price[stack.top()]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				span[i] = i+1;
			}
			else {
				span[i] = i - stack.top();
			}
			stack.push(i);
		}
		return span;
		
	}

}
