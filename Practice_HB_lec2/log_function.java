package Practice_HB_lec2;

import java.util.Scanner;

public class log_function {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int base = scn.nextInt();
		int ans = log(number, base);
		System.out.println(ans);
	}

	public static int log(int N, int base) {
		int a = 0;
		int temp = N;
		while(temp!=1){
			temp = temp/base;
			a++;
		}return a;
	}

}
