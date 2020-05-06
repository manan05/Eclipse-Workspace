package L1_CB;
import java.util.Scanner;

public class Practcie108 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scn.nextInt();
		int c = 0;
		int rem = 0;
		int g = 0;
		int m = 0;
		while (n != 0) {

			rem = n % 10;
			n = n / 10;
			g = (g * 10) + rem;

		}
		System.out.println("The Nummber is " + g);

	}

}
