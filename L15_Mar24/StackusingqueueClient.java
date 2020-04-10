package L15_Mar24;

public class StackusingqueueClient {

	public static void main(String[] args) throws Exception {
		Stackusingqueue stack = new Stackusingqueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop());

//		stack.display();

	}

}
