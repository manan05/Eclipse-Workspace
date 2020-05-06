import java.util.Random;

public class randomTest {

	public static void main(String[] args) {
		int n;
		Random test = new Random();
		for (int i = 0; i < 10; i++) {
			n = test.nextInt(6);
			System.out.println(n);
		}
	}
}
