package Practice_HB_lec2;

import java.util.Scanner;


public class RecursionHB {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(abc(n));
		
		
		

	}
	public static int abc(int n){
		int z = 0;
		for (int i= 1; i<=n;i++){
			z += i;
		}
		return z;
		
	}

}
