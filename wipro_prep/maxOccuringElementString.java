package wipro_prep;
import java.util.*;
public class maxOccuringElementString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		countMaxOccuring(str);
	}
	public static void countMaxOccuring(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		int[] freq = new int[arr.length];
		freq[0] = 1;int max = 1;
		for(int i = 0, j = i+1; i<arr.length && j<arr.length; i++, j++) {
			
			if(arr[i] == arr[j]) {
				freq[i] = max;
				max++;
			}
			else if(arr[i] != arr[j]) {
				freq[i] = max;
				max = 1;
			}
		}
		if(arr[arr.length-1] == arr[arr.length-2]) {
			freq[arr.length-1] = freq[arr.length-2] + 1;
		}
		else {
			freq[arr.length-1] = 1;
		}
//		for(int j : freq) {
//			System.out.print(j + " ");
//		}
		int max_count = freq[0];
		char a = arr[0];
		for(int i = 0; i<freq.length; i++) {
			if(max_count < freq[i]) {
				max_count = freq[i];
				a = arr[i];
			}
		}
		System.out.println(a + " " + max_count );
	}
}
