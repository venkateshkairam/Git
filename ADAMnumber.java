package Conditional_program;

import java.util.Scanner;

public class ADAMnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sqr, rev = 0, temp, rem, temp1, rev1 = 0, sqr1;
		System.out.println("Enter the value of n is:");
		n = sc.nextInt();

		sqr = n * n;// 144
		temp = sqr;// 12
		while (temp > 0) // 144>0
		{

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		// 441
		temp1 = n;
		while (temp1 > 0) {
			rem = temp1 % 10;
			rev1 = rev1 * 10 + rem;
			temp1 = temp1 / 10;// rev1=21
		}
		sqr1 = rev1 * rev1;// 441

		if (rev == sqr1) {
			System.out.println(n + " " + "is an adam number");
		} else {
			System.out.println(n + " " + " is not a adam number");
		}

	}

}
