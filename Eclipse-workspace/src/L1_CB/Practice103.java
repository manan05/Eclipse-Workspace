package L1_CB;
import java.util.Scanner;

public class Practice103 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int a = scn.nextInt();
		if (a % 2 != 0){
			System.out.print("Odd");
		}
		else{
			System.out.println("Even");
		}
}
}
