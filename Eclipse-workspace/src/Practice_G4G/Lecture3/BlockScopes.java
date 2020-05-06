package Lecture3;

public class BlockScopes {

	public static void main(String[] args) {
		System.out.println("Block Scope !");
		int one = 30;
		int two = 40;
		if (one < two) {
			int three = 30;
			System.out.println(three);
		}
//		System.out.println(three);  Here the variable three is not accessible outside the block

	}

}
