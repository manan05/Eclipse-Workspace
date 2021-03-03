package Tcs_prep;
import java.util.Scanner;

public class washingMachine_prepInsta {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n <= 2000 && n > 0) {
			System.out.println("25 minutes");
		}
		else if(n >= 2001 && n <= 4000) {
			System.out.println("35 minutes");
		}
		else if(n > 4000 && n <7000){
			System.out.println("45 minutes");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
