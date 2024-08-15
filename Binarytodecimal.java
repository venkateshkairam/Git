package Conditional_program;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bnum, dnum = 0, rem, base = 1;
		System.out.println("Enetr the binary number");
		bnum = sc.nextInt();

		while (bnum > 0) {
			rem = bnum % 10;
			dnum = dnum + rem * base;
			bnum = bnum / 10;
			base = base * 2;

		}
		System.out.println("Decimal equivalen of binary= " + dnum);
	}
}
