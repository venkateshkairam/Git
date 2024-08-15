package Conditional_program;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, rev = 0, rem;
		System.out.println("Enter the number of n:");
		n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Reverse number is=" + rev);
	}

}
