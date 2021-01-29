package wipro_prep;

import java.util.Scanner;

public class targetStringRepeated {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String target = scn.nextLine();
		countOccurences(str, target);
	}
	public static void countOccurences(String str, String target) {
		int count = 0;
		String[] inp = str.split("\\s+");
		String[] tar = target.split("\\s+");
		for(int i = 0; i<inp.length; i++) {
			if(inp[i].equals(tar[0])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
