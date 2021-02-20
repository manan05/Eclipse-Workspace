package Tcs_prep;

import java.util.Scanner;

public class mpcsExam_prepInsta {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] trainee = new int[3][3];
		int[] average = new int[3];

		for (int i = 0; i < trainee.length; i++) {
			for (int j = 0; j < trainee[0].length; j++) {
				trainee[i][j] = scn.nextInt();
				if (trainee[i][j] < 1 || trainee[i][j] > 100) {
					trainee[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < trainee.length; i++) {
			if (((trainee[0][i] + trainee[1][i] + trainee[2][i]) / 3) < 70) {
				System.out.println("Trainee unfit");
			} else {
				average[i] = (trainee[0][i] + trainee[1][i] + trainee[2][i]) / 3;
			}
		}
		int max = 0;
		for(int i = 0; i<average.length; i++) {
			if(average[i] > max) {
				max = average[i];
			}
		}
		for(int i = 0; i<average.length; i++) {
			if(average[i] == max) {
				System.out.println("Trainee Number:" + (i+1));
			}
		}
	}
}