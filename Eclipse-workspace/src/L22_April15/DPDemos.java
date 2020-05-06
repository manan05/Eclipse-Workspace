package L22_April15;

import java.util.Arrays;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 15-Apr-2018
 */

public class DPDemos {

	public static void main(String[] args) {

		int n = 1000000000;
		long start = System.currentTimeMillis();

		// System.out.println(fibonacci(n));
		// System.out.println(fibonacciTD(n, new int[n + 1]));
		// System.out.println(fibonacciBU(n));
		// System.out.println(fibonacciBUSlider(n));

		// System.out.println(boardPathTD(0, n, new int[n + 1]));
		// System.out.println(boardPathBU(n));
		// System.out.println(boardPathBUSlider(n));

		// System.out.println(mazePathTD(0, 0, n, n, new int[n + 1][n + 1]));
		// System.out.println(mazePathBU(n, n));
		// System.out.println(mazePathBUSlider(3, 4));
		// System.out.println(coin(n));

		// System.out.println(LCSBU("Saturdaybchdsguchgsuicweiuujdfhver",
		// "Sundaycwgcjhcu"));
		// System.out.println(EditDistanceBU("Saturday", "Sunday"));

		// int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// System.out.println(MCM(arr, 0, arr.length - 1, new
		// int[arr.length][arr.length]));
		// System.out.println(MCMBU(arr));
		int[] wt = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		System.out.println(Knapsack(wt, price, 0, 7, new int[wt.length][8]));
		System.out.println(KnapsackBU(wt, price, 7));
		long end = System.currentTimeMillis();
		// System.out.println(end - start);
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	public static int fibonacciTD(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int fnm1 = fibonacciTD(n - 1, strg);
		int fnm2 = fibonacciTD(n - 2, strg);

		int fn = fnm1 + fnm2;

		strg[n] = fn;
		return fn;
	}

	public static int fibonacciBU(int n) {

		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int fibonacciBUSlider(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;

		for (int slide = 1; slide <= n - 1; slide++) {

			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];

	}

	public static int boardPathTD(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int res = 0;

		for (int dice = 1; dice <= 6; dice++) {
			res += boardPathTD(curr + dice, end, strg);
		}

		strg[curr] = res;
		return res;
	}

	public static int boardPathBU(int n) {

		int[] strg = new int[n + 6];
		strg[n] = 1;

		for (int i = n - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}

		return strg[0];
	}

	public static int boardPathBUSlider(int n) {

		int[] strg = new int[6];
		strg[0] = 1;

		for (int slide = 1; slide <= n; slide++) {

			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}

		return strg[0];
	}

	public static int mazePathTD(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int ch = mazePathTD(cr, cc + 1, er, ec, strg);
		int cv = mazePathTD(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = ch + cv;
		return ch + cv;
	}

	public static long coin(int n) {

		if (n == 0) {
			return 0;
		}

		long val = n / 2 + n / 3 + n / 4;

		long ans = 0;

		if (val > n) {
			ans = coin(n / 2) + coin(n / 3) + coin(n / 4);
		} else {
			ans = n;
		}

		return ans;

	}

	public static int mazePathBU(int er, int ec) {

		int[][] strg = new int[er + 1][ec + 1];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er || col == ec) {
					strg[row][col] = 1;
				} else {

					int ch = strg[row][col + 1];
					int cv = strg[row + 1][col];

					strg[row][col] = ch + cv;
				}
			}
		}

		return strg[0][0];
	}

	public static int mazePathBUSlider(int er, int ec) {

		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);

		for (int slide = er - 1; slide >= 0; slide--) {

			for (int col = ec; col >= 0; col--) {

				if (col == ec) {
					strg[col] = 1;
				} else {
					strg[col] = strg[col] + strg[col + 1];
				}
			}
		}

		return strg[0];
	}

	public static int mazePathBUSliderDiag(int er, int ec) {

		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);
		int diag = 0;

		for (int slide = er - 1; slide >= 0; slide--) {

			for (int col = ec; col >= 0; col--) {

				if (col == ec) {
					strg[col] = 1;
					diag = 1;
				} else {
					int val = strg[col] + strg[col + 1] + diag;
					diag = strg[col];
					strg[col] = val;

				}
			}
		}

		return strg[0];
	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0)
			return 0;

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int c1 = LCS(s1, ros2);
			int c2 = LCS(ros1, s2);

			ans = Math.max(c1, c2);
		}

		return ans;

	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {

			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {
					int c1 = strg[row][col + 1];
					int c2 = strg[row + 1][col];

					strg[row][col] = Math.max(c1, c2);
				}
			}
		}

		return strg[0][0];

	}

	public static int EditDistance(String s1, String s2) {

		// del
		if (s1.length() == 0 && s2.length() != 0) {
			return s2.length();
		}

		// ins
		if (s1.length() != 0 && s2.length() == 0) {
			return s1.length();
		}

		if (s1.length() == 0 && s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans;
		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2);
		} else {

			int ins = EditDistance(ros1, s2);
			int del = EditDistance(s1, ros2);
			int rep = EditDistance(ros1, ros2);

			ans = Math.min(rep, Math.min(ins, del)) + 1;
		}

		return ans;

	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {

			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1];
				} else {
					int ins = strg[row + 1][col];
					int del = strg[row][col + 1];
					int rep = strg[row + 1][col + 1];

					strg[row][col] = Math.min(rep, Math.min(ins, del)) + 1;
				}
			}

		}

		return strg[0][0];

	}

	public static int MCM(int[] arr, int si, int ei, int[][] strg) {

		if (si + 1 == ei) {
			return 0;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k <= ei - 1; k++) {

			int fh = MCM(arr, si, k, strg);
			int sh = MCM(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];

			int ta = fh + sw + sh;

			if (ta < min) {
				min = ta;
			}
		}

		strg[si][ei] = min;
		return min;
	}

	public static int MCMBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[n][n];

		for (int slide = 2; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k <= ei - 1; k++) {

					int fh = strg[si][k];
					int sh = strg[k][ei];
					int sw = arr[si] * arr[k] * arr[ei];

					int ta = fh + sw + sh;

					if (ta < min) {
						min = ta;
					}
				}

				strg[si][ei] = min;
			}

		}

		return strg[0][n - 1];

	}

	public static int Knapsack(int[] wt, int[] price, int vidx, int cap, int[][] strg) {

		if (vidx == price.length) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

		int include = 0;
		int exclude = 0;

		if (wt[vidx] <= cap) {
			include = price[vidx] + Knapsack(wt, price, vidx + 1, cap - wt[vidx], strg);
		}
		exclude = Knapsack(wt, price, vidx + 1, cap, strg);

		int max = Math.max(include, exclude);

		strg[vidx][cap] = max;
		return max;
	}

	public static int KnapsackBU(int[] wt, int[] price, int cap) {

		int nr = wt.length + 1;
		int nc = cap + 1;

		int[][] strg = new int[nr][nc];

		for (int row = 1; row < nr; row++) {

			for (int col = 1; col < nc; col++) {

				if (col < wt[row - 1]) {
					strg[row][col] = strg[row - 1][col];
				} else {

					int include = price[row - 1] + strg[row - 1][col - wt[row - 1]];
					int exclude = strg[row - 1][col];

					strg[row][col] = Math.max(include, exclude);

				}
			}
		}

		return strg[nr - 1][nc - 1];

	}
}
