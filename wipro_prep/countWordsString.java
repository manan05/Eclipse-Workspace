package wipro_prep;
import java.util.Scanner;

public class countWordsString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		int count = 0;
		String str =  
		          "Hello this is manan arora. How are you? "; 
		System.out.println("No of words : " + 
		           countWords(str)); 

	}
	public static int countWords(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.split("\\s+");
		
		return words.length;
	}
	

}
