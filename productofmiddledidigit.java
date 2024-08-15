package Conditional_program;

import java.util.Scanner;

public class productofmiddledidigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int product = 1, n, rem;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		n = n / 10;

		while (n > 9) {

			rem = n % 10;
			product = product * rem;
			n = n / 10;
		}
		System.out.println("product of indivivual sum is=" + product);
	}

}
