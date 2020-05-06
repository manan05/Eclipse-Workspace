package Lecture4;

public class ArrayDemo {

	public static void main(String[] args) {

		// Declare
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);

		// get values
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get values
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// print using loop

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// print using enhanced for loop
		System.out.println("Enhanced for loop");
		for (int val : arr) {
			System.out.println(val);
		}
		
		//limitation of enhanced for loop is 
		//1.) Forward only
		//2.) read only (cannot update the array)

	}

}
