package DS;

import java.util.Scanner;

// marks input, package input, if marks > 70 or package > 8 give o/p as good else bad;	
public class checker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks?");
		int marks = scan.nextInt();
		System.out.println("Enter you Placement Package ?");
		int pack = scan.nextInt();
		if(marks > 70 || pack <= 8) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
	}
}