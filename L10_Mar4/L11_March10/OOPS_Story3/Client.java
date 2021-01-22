package L10_Mar4.L11_March10.OOPS_Story3;



public class Client {

	public static void main(String[] args) {
		
		// Case 1
		// Creating an obj for class P
		System.out.println("Case 1");
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		
		// Case 2
		// Creating an obj for class P
		// while compiling left side will be read 
		// if there is a collision in variables then
		// the variable whose reference is being made
		// wins (in our case the value of d in P will print)
		// ONLY FOR VARIABLES(data variables)
		
		System.out.println("Case 2");
		P obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(((C)obj2).d); // to print the value of d in class C
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2); // typecast the obj2 to C type
		
		// In cases of functions then when the space is allocated to C
		// it will go in the blue print of C and check if there is a function 
		// corresponding to the call then it will use the function present in C
		
		obj2.fun(); // will print the function present in C
		((P)obj2).fun(); // will always print fun from C
		obj2.fun1(); // will print fun1 present in P
		((C)obj2).fun2(); // Typecasting it to C to make the compiler stop giving error
		
		
		// Case 3
		System.out.println("Case 3");
//		C obj3 = new P();
		// This line is not allowed as while compiling there will be fun
		// but when space allocated then there will be run time errors 
		
		
		// Case 4
		System.out.println("Case 4");
		C obj4 = new C();
		System.out.println(obj4.d); // collision so value will print in C
		System.out.println(((P)obj4).d); // since typecasting so it will print value of P
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun();
		obj4.fun1();
		obj4.fun2();
		
	}

}
