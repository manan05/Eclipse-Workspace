package Lecture3;

public class GlobalVariable {
	public static int val = 20; // global variable

	public static void main(String[] args) {
		System.out.println("Global Scope !");
		System.out.println(val);
		int val = 200; // local variable
		System.out.println(val); // printing local var
		System.out.println(GlobalVariable.val); // printing global variable

		int ans = DemoGlobal(50);
		System.out.println(ans);

//		System.out.println(DemoGlobal(50));  shortcut method of the last 2 lines
	}

	public static int DemoGlobal(int one) {
		int sum = one + val;
		return sum;
	}

}

// Expected Output
// Global Scope !
// 20
// 200
// 20
// 70
