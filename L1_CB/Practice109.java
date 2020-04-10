package L1_CB;
import java.util.Scanner;

public class Practice109 {

	public static void main(String[] args) {
		// Pattern Question 1
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = 0;
		int j = 1;
		while (c < n) {
			System.out.print("* ");
			while (j < n) {
				System.out.print("* ");
				j = j + 1;
			}
			j = 1;

			System.out.println();
			c = c + 1;

		}

	}

}
