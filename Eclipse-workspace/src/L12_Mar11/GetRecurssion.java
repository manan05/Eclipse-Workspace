package L12_Mar11;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetRecurssion {

	public static void main(String[] args) {
		// System.out.println(permutation("abc"));
		// ArrayList<String> ans=BoardPath(0,10);
		// System.out.println(ans);
		// System.out.println(ans.size());
		 System.out.println(mazepathD(0, 0, 2, 2));
//		System.out.println(mazepathDMM(0, 0, 2,2));

	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recursionresult = getSS(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (String z : recursionresult) {
			myresult.add(z);
			myresult.add(ch + z);

		}
		return myresult;

	}

	public static ArrayList<String> getAsciiSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recursionresult = getAsciiSS(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (String z : recursionresult) {
			myresult.add(z);
			myresult.add((int) ch + z);
			myresult.add(ch + z);

		}
		return myresult;

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

	public static ArrayList<String> Keyss(String ss) {
		// BASe case
		if (ss.length() == 0) {
			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch = ss.charAt(0);
		String buttonstring = getCode(ch);
		String ros = ss.substring(1);

		ArrayList<String> recursionresult = Keyss(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (int z = 0; z < buttonstring.length(); z++) {
			for (String i : recursionresult) {
				{
					myresult.add(buttonstring.charAt(z) + i);
				}

			}

		}
		return myresult;
	}

	public static ArrayList<String> permutation(String ss) {
		if (ss.length() == 0) {
			ArrayList<String> bs = new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch = ss.charAt(0);
		String ros = ss.substring(1);

		ArrayList<String> recursionresult = permutation(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (String i : recursionresult) {
			for (int z = 0; z <= i.length(); z++) {
				String val = i.substring(0, z) + ch + i.substring(z);
				myresult.add(val);
			}

		}
		return myresult;
	}

	public static ArrayList<String> BoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> cc = new ArrayList<>();
			cc.add("");
			return cc;
		}
		if (curr > end) {
			ArrayList<String> cc = new ArrayList<>();
			return cc;
		}
		ArrayList<String> myresult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> recursionresult = BoardPath(curr + dice, end);

			for (String i : recursionresult) {
				myresult.add(dice + i);
			}
		}

		return myresult;

	}

	public static ArrayList<String> mazepath(int cr, int cc, int er, int ec) {
		if (cc > ec || cr > er) {
			ArrayList<String> ab = new ArrayList<>();
			return ab;
		}
		if (cr == er && cc == ec) {
			ArrayList<String> ab = new ArrayList<>();
			ab.add("");
			return ab;
		}
		ArrayList<String> myresult = new ArrayList<>();

		ArrayList<String> rrh = mazepath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			myresult.add("H" + rrhs);

		}
		ArrayList<String> rrv = mazepath(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			myresult.add("V" + rrvs);

		}
		return myresult;
	}

	public static ArrayList<String> mazepathD(int cr, int cc, int er, int ec) {
		if (cc > ec || cr > er) {
			ArrayList<String> ab = new ArrayList<>();
			return ab;
		}
		if (cr == er && cc == ec) {
			ArrayList<String> ab = new ArrayList<>();
			ab.add("");
			return ab;
		}
		ArrayList<String> myresult = new ArrayList<>();

		ArrayList<String> rrh = mazepathD(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			myresult.add("H" + rrhs);

		}
		ArrayList<String> rrv = mazepathD(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			myresult.add("V" + rrvs);

		}
		ArrayList<String> rrd = mazepathD(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			myresult.add("D" + rrds);

		}
		return myresult;
	}

	public static ArrayList<String> mazepathDMM(int cr, int cc, int er, int ec) {
		if (cc > ec || cr > er) {
			ArrayList<String> ab = new ArrayList<>();
			return ab;
		}
		if (cr == er && cc == ec) {
			ArrayList<String> ab = new ArrayList<>();
			ab.add("");
			return ab;
		}
		ArrayList<String> myresult = new ArrayList<>();
		for (int i = 1; i <= ec && i <= er; i++) {
			ArrayList<String> rrh = mazepathDMM(cr, cc + i, er, ec);
			for (String rrhs : rrh) {
				myresult.add("H" + i + rrhs);

			}
			ArrayList<String> rrv = mazepathDMM(cr + i, cc, er, ec);
			for (String rrvs : rrv) {
				myresult.add("V" + i + rrvs);

			}
			ArrayList<String> rrd = mazepathDMM(cr + i, cc + i, er, ec);
			for (String rrds : rrd) {
				myresult.add("D" + i + rrds);
			}
		}
		return myresult;
	}
}