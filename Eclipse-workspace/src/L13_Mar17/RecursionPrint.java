package L13_Mar17;

public class RecursionPrint {

	public static void main(String[] args) {
		// System.out.println(printSS("abc", ""));
		// System.out.println(printSSAscii("abc", ""));
		// System.out.println(KCP("145",""));
		// duplicate("abaa", "");
		// System.out.println(lexico(0, 1000));
		// System.out.println(coinNoConsecutive(3, "", false));
		// boolean[][] board = new boolean[4][4];
		// System.out.println(nQueen(board, 0, ""));
		int[] arr = { 10,20,40,20,50 };
		splitarray(arr, 0, 0, 0, "", "");
	}

	public static int printSS(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		int no = printSS(ros, ans);
		int yes = printSS(ros, ans + ch);

		return no + yes;
	}

	// SubSequencesAscii !!
	public static int printSSAscii(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		int no = printSSAscii(ros, ans);
		int yes = printSSAscii(ros, ans + ch);
		int y = printSSAscii(ros, ans + (int) ch);
		return no + yes + y;

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";

	}

	public static int KCP(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		int time = 0;
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			time += KCP(ros, ans + code.charAt(i));
		}
		return time;
	}

	public static int permutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		int t = 0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			t += permutations(ros, ans + ch);
		}
		return t;
	}

	public static int lexico(int curr, int end) {
		if (curr >= end) {
			return 1;
		}
		int t = 0;
		int z = 0;
		System.out.println(curr);
		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				t += lexico(curr * 10 + i, end);
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				z += lexico(curr * 10 + i, end);
			}
		}
		return t + z;
	}

	public static void duplicate(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			boolean flag = true;
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			for (int j = i + 1; j < ques.length(); j++) {
				if (ch == ques.charAt(j)) {
					flag = false;
				}
			}
			if (flag == true) {
				duplicate(ros, ans + ch);
			}
		}
	}

	public static int coin(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int z = 0;
		int m = 0;
		z += coin(n - 1, ans + "H");
		m += coin(n - 1, ans + "T");
		return z + m;
	}

	public static int coinNoConsecutive(int n, String ans, boolean a) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}

		int z = 0;
		int m = 0;
		if (!a) {
			z += coinNoConsecutive(n - 1, ans + "H", true);
			m += coinNoConsecutive(n - 1, ans + "T", false);
		} else {
			m += coinNoConsecutive(n - 1, ans + "T", false);
		}
		return z + m;
	}

	// L14
	public static int nQueen(boolean[][] board, int row, String asf) {
		if (row == board.length) {
			System.out.println(asf);
			return 1;
		}
		int z = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				z += nQueen(board, row + 1, asf + "{" + row + "," + col + "}");
				board[row][col] = false;
			}
		}
		return z;
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		int r = row;
		int c = col;
		// vertical
		while (r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
		}
		r = row;
		c = col;
		// Diagonal LEft
		while (c >= 0 && r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		} // Diagonally Right
		r = row;
		c = col;
		while (c < board[0].length && r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void splitarray(int[] arr, int vidx, int ssf1, int ssf2, String asf1, String asf2) {
		if (vidx == arr.length) {
			if (ssf1 == ssf2) {
				System.out.println(asf1 + "and" + asf2);
			}
			return;
		}
		splitarray(arr, vidx+1, (ssf1 + arr[vidx]), ssf2, asf1 + "{" + arr[vidx] + "}", asf2);
		splitarray(arr, vidx+1, ssf1,(ssf2 + arr[vidx]), asf1, asf2 + "{" + arr[vidx] + "}");
	}
}
