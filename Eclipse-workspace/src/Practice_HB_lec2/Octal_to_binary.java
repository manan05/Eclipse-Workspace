package Practice_HB_lec2;

import java.util.Scanner;

public class Octal_to_binary {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int N = scn.nextInt();
		int decimal = 0;
		int q = N;
		int a = 0;
		int power = 1;
		while (q!= 0){
			a=q%10;
			decimal = decimal + (a*power);
			power*=8;
			q=q/10;
			
		}
		int  c= 0;
		int pwer = 1;
		int binary = 0;
		while(decimal != 0){
			c=decimal % 2;
			binary = binary + c*pwer;
			pwer*=10;
			decimal = decimal /2;
			
			
		}System.out.println(binary);
		}

}
