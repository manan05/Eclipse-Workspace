package Lecture3;

public class PassByValue {

	public static void main(String[] args) {
		int one = 20;
		int two = 40;
		System.out.println("Pass By Value !");
		System.out.println(one + "," + two);
		Swap(one, two);
		// Now the swapping will revert.
		System.out.println(one + "," + two);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + "," + two);
		
		// Swap only valid till this block is executed.
	}

}

//Expected Output
//Pass By Value !
//20,40
//40,20
//20,40