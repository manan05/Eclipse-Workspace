package Stack;

public class StackClient {

	public static void main(String[] args) throws Exception {
		Stack myStack = new Stack();
		
		//Push ops
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		
		//Display Stack
		myStack.display();
//		myStack.push(60);	this line throws exception
		
		//Pop ops
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
		
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.top());
		System.out.println(myStack.size());
	}

}
