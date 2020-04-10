package Practice_HB_lec2;

import java.util.Scanner;

public class Is_reverse_rec {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int s1 = scn.nextInt();
		int s2 = scn.nextInt();
		int c = reverse(s1,s2);
		System.out.println(check(s2,c));
		
	}
	public static int reverse(int n1,int n2){
		
		int c = 0;
		int a = 0;
		while (n1 != 0) {
			a = n1 % 10;
			n1 = n1 / 10;
			c = c * 10 + a;
		}
		return c;
		
	}
	public static boolean check(int s2, int c){
		if(s2 == c){
			return true;
		}
		else{
			return false;
		}
	}
}