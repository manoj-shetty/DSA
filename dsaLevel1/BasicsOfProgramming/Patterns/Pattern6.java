//1. You are given a number n.
//2. You've to create a pattern of * and separated by tab as shown in output format.

package nados.dsaLevel1.BasicsOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int st = n / 2 + 1;
		int sp = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			System.out.println();
			if (i <= n / 2) {
				st--;
				sp += 2;
			} else {
				st++;
				sp -= 2;
			}
		}
	}

}
