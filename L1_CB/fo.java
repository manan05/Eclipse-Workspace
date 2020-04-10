package L1_CB;
public class fo {

	public static void main(String[] args) {
		int n = 5;
		int nst = n;
		int nsp = 0;

		int row = 1;
		while (row <= n) {

			// self work for spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			// next row preparation
			System.out.println();
			nst = nst - 1;
			nsp = nsp + 1;
			row = row + 1;
		}
	}
}