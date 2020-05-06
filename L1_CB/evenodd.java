package L1_CB;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2!=0) {
			System.out.println("The Number is Odd");
		}
		else {
			System.out.println("The Number is Even");
		}
	}
}
