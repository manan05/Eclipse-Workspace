package L1_CB;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
