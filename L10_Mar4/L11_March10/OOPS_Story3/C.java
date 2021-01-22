package L10_Mar4.L11_March10.OOPS_Story3;


// because C extends P all the functions/ properties of P are in C 
public class C extends P {

	int d = 20;
	int d2 = 200;
	
	public void fun2() {
		System.out.println("in C fun2");
		
	}
	
	public void fun() {
		System.out.println("in C fun");
//		super.fun(); // if You want to call the fun of parent class
	}
}
