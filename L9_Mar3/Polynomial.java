package L9_Mar3;

import java.util.Arrays;
import java.util.Scanner;

public class Polynomial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//	Fnt n = scn.nextInt();
		// polynomialEval(n, x);
//		System.out.println(power(x, n));
//		System.out.println(countPalindromicSS("aabbccdd"));
		int n = scn.nextInt();
		SOE(n);
	}

	public static void polynomialEval(int x, int n) {
		int ans = 0;
		int power = x;
		for (int i = n; i >= 1; i--) {
			int a = 0;

			ans = ans + (power * i);
			power = power * x;
		}
		System.out.println(ans);
	}

	public static int power(int x, int n) {

		int ans = 0;

		if (n == 0) {
			return 1;
		}
		int p = power(x, n / 2);
		if (n % 2 == 0) {
			ans = p * p;
		} else {
			ans = x * (p * p);
		}
		return ans;
	}

	public static int countPalindromicSS(String str) {
		int c = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis + orbit) == str.charAt(axis - orbit)) {
					c++;
				} else {
					break;
				}
			}
		} // even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis + orbit)) == str.charAt((int) (axis - orbit))) {
					c++;
				} else {
					break;
				}
			}
		}

		return c;
	}
	
	public static void SOE(int n){
		boolean [] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for (int table = 2; table * table <=n;table++){
			if(primes[table] == true){
				for (int m = 2;table * m <=n;m++){
					primes[table * m] = false;
				}
			}
		}for (int i =0;i< primes.length;i++){
			if (primes[i]){
				System.out.println(i);
			}
		}
	}

}
