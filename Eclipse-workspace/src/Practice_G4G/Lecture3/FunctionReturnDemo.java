package Lecture3;

public class FunctionReturnDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		int sum = additionReturn(30, 40); //This sum is a local variable of main
		System.out.println(sum);
	}

	public static int additionReturn(int a, int b) {
		int sum = a + b;	//This sum is a local variable of additionReturn
		return sum;
	}

}
