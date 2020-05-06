package Lecture3;

public class FunctionDemo {

	public static void main(String[] args) {
		// Function calling:
		System.out.println("Hello");
		
		addition();
		
		System.out.println("Bye");
	} 

	// Function definition
	public static void addition() {

		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

}
