package Lecture3;

public class FunctionParams {

	public static void main(String[] args) {
		System.out.println("Hello");
		additionParams(10, 20);
		System.out.println("In Between");
		additionParams(30, 40);
		System.out.println("Bye");
	}

	public static void additionParams(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

}
