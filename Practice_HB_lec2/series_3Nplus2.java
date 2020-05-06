package Practice_HB_lec2;

import java.util.Scanner;

public class series_3Nplus2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		series(N1,N2);

	}public static void series(int N1,int N2){
		int count = 0;
		int c = 0;
		int ans = 0;
		int m = 1;
		while(c < N1){
			ans = (3*m + 2);
			if (ans % N2 != 0){
				System.out.println(ans);
				c++;
			}m++;
			count++;
		}
	}

}
