package L1_CB;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int c = 0;
		int a = 0;
		while( n != 0)
		{
			a=n%10;
			n=n/10;
			c=c*10 + a;
		}
		{
			System.out.println(c);
		}
		

	}

}