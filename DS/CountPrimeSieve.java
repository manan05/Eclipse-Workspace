package DS;

public class CountPrimeSieve {

	public static void main(String[] args) {
		System.out.println(countPrimes(2));

	}

	public static int countPrimes(int n) {
		if (n < 2) { // if number is 0 or 1 then return 0
			return 0;
		}
		boolean[] isPrime = new boolean[n]; // create a new boolean array
		for (int i = 2; i < n; i++) {
			isPrime[i] = true; // changing all the elements to true;
		}

		int sqrt = (int) Math.sqrt(n);
		for (int p = 2; p <= sqrt; p++) { // loop till sqrt of the element
			if (isPrime[p]) { // if the array element is prime (true)
				for (int i = p * p; i < n; i = i + p) { // making the multiples after the square of i as false
					isPrime[i] = false;
				}
			}
		}

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {//if the value at i is true
				count++; //incrementing count
			}
		}
		return count;
	}
}
