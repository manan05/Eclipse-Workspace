package Strings;

public class stringBuilderDemo {

	public static void main(String[] args) {
		
		//Conversion of String to StringBuilder
		String str = "Hello";
		//and then pass this str to the parenthesis of the StringBuilder
//		StringBuilder sb2 = new StringBuilder(str);
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		
		//Length of the String Builder
		System.out.println(sb.length());
		
		//Append Function of string builder
		sb.append("abc");
		System.out.println(sb);
		
		//Insert function of String Builder
		sb.insert(2, "def");
		System.out.println(sb);
		
		sb.insert(sb.length(), "jkl");
		System.out.println(sb);
		
		//Delete function of String Builder
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//Update the value at a particular index
		sb.setCharAt(4, 'd');
		System.out.println(sb);
		
		//ranges
		sb.insert(sb.length(), 'c');
		System.out.println(sb);
		
		//StringBuilder to string
		String s = sb.toString();
		System.out.println(s);

	}

}
