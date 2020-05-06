package Practice_HB_lec2;

import java.util.Scanner;

public class Conversion_of_bases {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		if (sb == 2 && db == 10) {
			System.out.println(dec2bin(sb, db, sn));
		} else if (sb == 10 && db == 2) {
			System.out.println(dec2bin(sb, db, sn));
		} else if (sb == 8 && db == 10) {
			System.out.println(dec2bin(sb, db, sn));

		} else if (sb == 10 && db == 8) {
			System.out.println(dec2bin(sb, db, sn));
		} else if (sb == 8 && db == 2) {
			System.out.println(other(sb, db, sn));
		} else if (sb == 2 && db == 8) {
			System.out.println(other(sb, db, sn));
		}else{
			System.out.println(other(sb,db,sn));
		}
	}

	public static int dec2bin(int sb, int db, int sn) {
		int ab = sn;
		int ans = 0;
		int power = 1;
		while (ab != 0) {
			int a = ab % db;
			ans = ans + (a * power);

			power *= sb;
			ab = ab / db;
		}
		return ans;
	}

	public static int other(int sb, int db, int sn) {
		int decimal = 0;
		int q = sn;
		int a = 0;
		int power = 1;
		while (q != 0) {
			a = q % 10;
			decimal = decimal + (a * power);
			power *= sb;
			q = q / 10;

		}
		int c = 0;
		int pwer = 1;
		int binary = 0;
		while (decimal != 0) {
			c = decimal % db;
			binary = binary + c * pwer;
			pwer *= 10;
			decimal = decimal / db;

		}
		return binary;

	}
}
