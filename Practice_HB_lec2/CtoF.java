package Practice_HB_lec2;

import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();
		for (int i = minF; i<= maxF; i+= step){
			int C = (int)((5.0/9)*(i-32));
			System.out.println(i + "\t" + C);
		}
	}

}
