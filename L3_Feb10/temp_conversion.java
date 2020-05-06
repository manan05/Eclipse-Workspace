package L3_Feb10;

import java.util.Scanner;

public class temp_conversion {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int minF = scn.nextInt();
	int maxF = scn.nextInt();
	int step = scn.nextInt();
	
	for (int i = minF; i<=maxF; i+=step){
		int c = (int)((5.0/9)*(i-32));// 5.0 to convert the number to double
		System.out.println(i + "\t \t" + c);
	}
	}

}
