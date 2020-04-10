	package Practice_HB_lec2;
	
	import java.util.Scanner;
	
	public class Pattern_HB {
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
	
			int n = scn.nextInt();
			
			int nst = 1;
	
			for (int row = 1; row <= n; row++) {
	
				for (int cst = n; cst >= nst; cst--) {
					System.out.print("*" + "\t");
				}
	
				nst++;
				System.out.println();
			}
		}
	}
