package L1_CB;
import java.util.Scanner;

public class Practice101{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your marks:");
		int marks = scn.nextInt();
		System.out.print("Enter your placement package:");
		int pack = scn.nextInt();
		if (marks > 70 || pack > 8){
			System.out.println("Good");
		}else{
			System.out.println("Bad");
		}
		
		
		
	}

}
		