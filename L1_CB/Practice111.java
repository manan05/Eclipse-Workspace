package L1_CB;
import java.util.Scanner;

public class Practice111 {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();

		int a = 0;
		int b = 1;
		int counter = 0;

		while (counter <= n) {
			int sum = a + b;
			a = b;
			b = sum;
			System.out.println(a);

			counter++;
		}
	}
}
