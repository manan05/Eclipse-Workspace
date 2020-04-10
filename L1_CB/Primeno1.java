package L1_CB;
import java.util.Scanner;

public class Primeno1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number that you want to check::");
		int n = scn.nextInt();
		int c = 2;
		int flag = 0;
		while (c < n) {
			if (n % c == 0) {
				flag = 1;
				break;
			}
			c = c + 1;
		}

		if (flag == 1) {
			System.out.println("Not prime");
		} else {
			System.out.println("Prime");
		}
	}

}
