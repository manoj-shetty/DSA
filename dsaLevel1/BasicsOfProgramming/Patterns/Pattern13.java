//1. You are given a number n.
//2. You've to create a pattern as shown in output format
//	1	
//	1	1	
//	1	2	1	
//	1	3	3	1	
//	1	4	6	4	1	
//	1	5	10	10	5	1	

package nados.dsaLevel1.BasicsOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			int val = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(val + "\t");
				val = (val * (i - j)) / (j + 1);
			}
			System.out.println();
		}
	}

}