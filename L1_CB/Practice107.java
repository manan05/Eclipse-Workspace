package L1_CB;
import java.util.Scanner;

public class Practice107 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int number = scn.nextInt();
		int c = 0;
		int s = 0;
		int first = 0;
		int second = 1;
		while (c < number) {
			
			
			s = first + second;
//			System.out.println(s);
			first = second;
			second = s;
//			System.out.println(first);
//			System.out.println(second);
			c = c + 1;

		}
		System.out.println(first);
	}
}
