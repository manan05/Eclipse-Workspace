package Functions;

public class FunctionDemo {
	// Global variable
	public static int val = 20;
	
	public static void main(String[] args) {
//		int a = 5;
//		int b = 10;
//		int c = a + b;
//		System.out.println(c);
//		// Now if we want to add 20 and 30;
//
//		int n1 = 20;
//		int n2 = 30;
//		int sum = n1 + n2;
//		System.out.println(sum);
//		// As the code for sum is repeating, we make function
//		// of the code.
		System.out.println("Hello");
		// function call
		addition();
		System.out.println("Bye");

		// Part 2 = function with parameters
		System.out.println("Function with parameters :");
		additionparams(10, 20);
		additionparams(30, 40);

		// Part 3 = function that returns;
		System.out.println("Function Return value:");
		int sum = additionReturn(50, 60);
		System.out.println(sum);
		
		//Part 4 = Variable scopes;
		System.out.println("Part 4 = Demo scopes");
		int one = 10;
		int two = 20;
		int res = demoScopes(one, two);
		System.out.println(res);
		
		// Part 5 = Global Scope
		System.out.println("Part 5 : Global Scope:");
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionDemo.val);
		DemoGlobalScopes(one);
		
		// Part 6 : Block Scope
		if(one<two) {
			int three = 100;
			System.out.println(three);
		}
		
		// Part 7 : Pass by value
		System.out.println("Part 7 : Pass by value");
		System.out.println(one + "," + two);
		swap(one,two);
		System.out.println(one + "," + two);

	}
	
	public static void swap(int one, int two) {
		System.out.println(one + "," + two);
		
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + ","+ two);
	}
	public static int DemoGlobalScopes(int one) {
		int sum = one + val;
		return sum;
	}
	
	public static int demoScopes(int one, int another) {
		int sum = one + another;
		return sum;
	}

	public static void additionparams(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	// Definition of the function
	public static void addition() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	public static int additionReturn(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
