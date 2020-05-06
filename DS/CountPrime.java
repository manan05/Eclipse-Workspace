package DS;
// this was count prime using iteration only
//or we can say the conventional method
public class CountPrime {

	public static void main(String[] args) {
		System.out.println(countPrimes(499979));
	}

	public static int countPrimes(int n) {
		int count = 0;
		if (n <= 1) {
			return count;
		} else {
			
			for (int i = 2; i < n; i++) {
				if(checkPrime(i)) {
					count++;
				}
			}
			return count;
		}
		
	}

	public static boolean checkPrime(int n) {
		int flag = 0;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				flag = 1;
				
			}
		}
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
