import L1_CB.IsPrime;

/**
 * @author Manan Arora
 * @email mananarora313@gmail.com
 * @date 06-Aug-2020
 */

public class PrimeNumber {

	// Check whether no is prime or not
	public static void main(String[] args) {

		int n = 96;
		isPrime(n);
	}
	public static void isPrime(int n) {
		int flag = 0;
		if(n == 1 || n == 2) {
			flag = 0;
		}
		else {
			for(int i = 2; i<Math.sqrt(n);i++) {
				if(n%i == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime");
			}
		}
	}

}
