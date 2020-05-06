package Practice_HB_lec2;

import java.util.Scanner;

public class Powe{

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int a = scn.nextInt();
	int b = scn.nextInt();
	System.out.println(power(a,b));
	}
	public static int power(int a,int b){
		int ans = (int) Math.pow(a, b);
		return ans;
	}

}
