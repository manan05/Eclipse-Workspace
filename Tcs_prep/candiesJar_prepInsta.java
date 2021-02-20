package Tcs_prep;

import java.util.Scanner;

// jar contain max N candies
// can have M candies i.e (M<=N)

public class candiesJar_prepInsta {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();;//no of candies available
		int k = scn.nextInt(); // no of min candies that must be inside JAR
		int candy_bought = scn.nextInt(); // candies to be bought
		if(candy_bought >=1 && candy_bought <=k) {
			System.out.println("NUMBER OF CANDIES SOLD:" + candy_bought);
			System.out.println("NUMBER OF CANDIES LEFT:" + (n-candy_bought));
		}
		else {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT:" + n);
		}
	}
}
