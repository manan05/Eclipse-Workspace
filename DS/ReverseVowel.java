package DS;
//Input: "hello"

//Output: "holle"
//Write a function that takes a string as input and reverse only the vowels of a string.

public class ReverseVowel {
	public static void main(String[] args) {
		String s = "leetcode";	//hardcode input
//		System.out.println(s);
		System.out.println(reverseVowels(s));
		
	}

	public static String reverseVowels(String s) {
		char[] convStr = s.toCharArray(); //converting the string s to an array using toCharArray()
		int front = 0;	//for the front of array
		int back = convStr.length - 1; //for the back of array
		while (front < back) {
			if (isVowel(convStr[front]) == false) { //if first char is not a vowel
				front++; // only increment front
			}
			if (isVowel(convStr[back]) == false) { //if last char is not a vowel
				back--; // decrement back
			}
			if (isVowel(convStr[front]) == true && isVowel(convStr[back]) == true) { //swap if both elements are vowel
				char temp = convStr[front];
				convStr[front] = convStr[back];
				convStr[back] = temp;
				front++;
				back--;
			}
		}
		return new String(convStr); 

	}
	// this function checks if the character ch is vowel or not and returns true or false
	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
}
