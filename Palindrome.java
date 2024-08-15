package Conditional_program;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, rem, rev = 0, temp;
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		temp = n;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Given number is pallidrome=" + rev);
		} else {
			System.out.println("Given number is not palidrome=" + rev);
		}
	}

}
