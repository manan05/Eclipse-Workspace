package DS;

public class Test {

	public static void main(String[] args) {
		System.out.println("TwoLoops");
		twoLoops();
		System.out.println("TwoVarsinSameLoop");
		twoVarsinSameLoop();

	}
	// in this we coded two loops and checked the 
	// values of i and j printed
	public static void twoLoops() {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.println(i + "+" + j);
			}
		}
	}

	public static void twoVarsinSameLoop() {
		for (int i = 0, j = i + 1; i < 5 && j < 5; i++, j++) {
			System.out.println(i + "+" + j);
		}

	}
}
