package Conditional_program;

import java.util.Scanner;

public class Individalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of value of an n:");
		n = sc.nextInt();
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of individal digits is:" + sum);

	}

}
