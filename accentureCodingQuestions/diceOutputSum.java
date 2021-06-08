package accentureCodingQuestions;

import java.util.Scanner;

public class diceOutputSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // target sum
		targetSumDice(n);
	}

	public static void targetSumDice(int n) {
		int count = 0;
		for (int i = 1; i<=6;i++) {
			for(int j = 1; j <= 6; j++) {
				if((i + j) == n) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}

}
