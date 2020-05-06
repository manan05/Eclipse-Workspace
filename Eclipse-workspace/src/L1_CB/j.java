package L1_CB;
import java.util.Scanner;


public class j {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		
		while (i < n ) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				break;
			}
			i++;
		}
		if (i == n) {
			System.out.println("Prime");
		}
		
//		boolean divided = false;
//		while (i < n && !divided) {
//			if (n % i == 0) {
//				System.out.println("Not Prime");
//				divided = true;
//			}
//			i++;
//		}
//		if (!divided) {
//			System.out.println("Prime");
//		}
		
		
	}

}
