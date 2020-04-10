package Array;

public class arrayDemo {

	public static void main(String[] args) {

		// declare an array
		System.out.println("Declare array");
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		System.out.println("Allocate Space");
		arr = new int[5];
		System.out.println(arr);

		// get
		System.out.println("Get initially");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		System.out.println("Set for first time");
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//get
		System.out.println("Get 2nd time");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		//print using loop
		System.out.println("print using loop");
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//enhanced for loop
		System.out.println("enhanced for loop");
		for(int i:arr) {	// does not have any relation with index
			System.out.println(i);
		}
		//	limitation
		//= forward only
		//= read only
		
		//reverse order printing
		System.out.println("Reverse order print");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
