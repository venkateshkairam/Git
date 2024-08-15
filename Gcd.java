package Conditional_program;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, rem, den, num;
		System.out.println("Enter the first number");
		n1 = sc.nextInt();
		System.out.println();
		n2 = sc.nextInt();
		if (n1 > n2) {
			num = n1;
			den = n2;
		} else {
			num = n2;
			den = n1;
		}
		rem = num % den;
		while (rem != 0) {
			num = den;
			den = rem;
			rem = num % den;
		}
		System.out.println("GCD of two numbers=" + den);
	}

}
