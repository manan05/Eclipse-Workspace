// Decimal to Octal
package Practice_HB_lec2;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int N = scn.nextInt(); //binary number
		int power = 1;
		//int power = (int) Math.pow(2, c);
		int decimal = 0;
		int a=0;
		while(N != 0){
			a=N%8;
			decimal=decimal + (a*power);
			power*=10;
			N=N/8;
		}System.out.print(decimal);

	}

}
