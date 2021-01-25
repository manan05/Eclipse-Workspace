package Strings;

import java.util.Scanner;

public class stringDemo {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// PART - 1
		String str = "Hello"; // Declaring a string
//		str = "bye";
		System.out.println(str); 

		// PART - 2
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5)); // StringIndexOutofBoundsException

		// PART - 3
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(2, 5));
		System.out.println(str.substring(3, 3));
		System.out.println(str.substring(0, 3));

		System.out.println(str.substring(3));
		System.out.println(str.substring(1));

		// PART - 4 = Concatenation
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);
//		String s5  = s1+1;
//		System.out.println(s5);
		// PART - 5 = indexOf
		System.out.println(str.indexOf("el")); // 1 - returns index of e
		System.out.println(str.indexOf("ello")); // 1 - returns index of e
		System.out.println(str.indexOf("lol")); // -1 because subString not present in the string

		// PART - 6 = startsWith - returns true if the str starts with the given params
		System.out.println(str.startsWith("he")); // false
		System.out.println(str.startsWith("He")); // true

		// PART - 7 = (== and equals());
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2)+ ","+ s1.equals(s2)); // true true
		System.out.println((s1 == s3) + "," + s1.equals(s3)); // true true
		System.out.println((s1 == s4) + "," + s1.equals(s4)); // false true	
		
	}

}
