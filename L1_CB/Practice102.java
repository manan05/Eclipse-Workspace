package L1_CB;
import java.util.Scanner;

public class Practice102 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the principal amount:");
		int p = scn.nextInt();
		System.out.print("Enter the time period:");
		int t = scn.nextInt();
		System.out.print("Enter the rate of interest:");
		int r = scn.nextInt();
		int si = (p*r*t)/100 ;
		System.out.println("Simple Interest =" + si);
		
				
	}

}
