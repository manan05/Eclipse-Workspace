package L11_March10.OOPS_Story3.Overloading;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class FOClient {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4} ;
		fun(1, arr);
	}

	public static void fun() {
		System.out.println("in fun 1");
	}

	public static void fun(int a) {
		System.out.println("in fun 2");
	}

	public static void fun(int a, int... vargs) {

		for (int val : vargs) {
			System.out.println(val);
		}
	}
	
	public static void fun(int a, int b) {
		System.out.println("in fun");
		System.out.println(a + " " + b);
	}

	// private static int fun(int a) {
	// System.out.println("in fun 4");
	//
	// return 1 ;
	// }

	public static void fun(double a) {
		System.out.println("in fun 3");
	}

	

}
