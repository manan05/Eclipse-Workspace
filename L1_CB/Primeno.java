package L1_CB;
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		int c = 2;
		int flag =0;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while( c < n ){
			if (n % c == 0 ){
				flag=1;
				break;
			}
			c=c+1;
			}
		if ( flag ==0){
			System.out.println("Prime");}
		else{
			System.out.println("Not Prime");}
		}
		}

			
			
		