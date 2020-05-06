 package DS;

//whether an integer is palindrome or not
//eg
//input = 121 . output = true
//input = -121 . output = false
public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(2147483647));
	}

	public static boolean isPalindrome(int x) {
		int num = x;
		if(x<0) {	//Number is negative so rejecting it.
			return false; 
		}
		else {
			int res = reverse(x); //call reverse fn
			if(num == res) { //checks if original == reversed
				return true;
			}
			else {
				return false;
			}
			
		}
	}

	public static int reverse(int x) { //reverses the number and returns
		int rem = 0;
		int z = 0;
		if (x > Integer.MAX_VALUE) {
			return 0;
		} else {
			while (x != 0) {

				z = x % 10;
				rem = rem * 10 + z;
				x = x / 10;
			}
			return rem;
		}
	}
}
