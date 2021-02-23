package wipro_prep;

public class TestOOps {

	public void print1() {
		System.out.println("In Print1");
	}
	private static void print2() {
		System.out.println("In print2");
	}
//	public static void main(String[] args) {
//		print2();
//	}
}

class A extends TestOOps{
	public static void main(String[] args) {
		A obj = new A();
		obj.print1();
	}
}

