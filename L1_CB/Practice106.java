package L1_CB;
import java.util.Scanner;

public class Practice106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int c = 2;
		int m = 0;
		if (a == 1) {
			System.out.println("1 is a unique number");
		} else {
			while (c < a) {
				if (a % c == 0) {
					m = 1;
					break;
				}
				c = c + 1;

			}
		}
		if (m == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
