package Conditional_program;

import java.util.Scanner;

public class Fact {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, fact = 1, i;
		System.out.println("Enter the n value is:");
		n = sc.nextInt();
		if (n == 0) {
			fact = 1;
		} else {
			i = 1;

			while (i <= n) {
				fact = fact * i;
				i++;
			}
			System.out.println("the factorial number is=" + fact);
		}

	}
}
