package DS;

public class UniqueCharString {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqueChar(s));

	}
	public static int firstUniqueChar(String s) {
		for(int i = 0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return i; 
			}
		}
		return -1;
	}

}
