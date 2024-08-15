package Conditional_program;

import java.util.Scanner;

public class Netbalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		long ac = sc.nextLong();
		System.out.println("Enter the accout name");
		String name = sc.next();
		System.out.println("Enter the current balance");
		double cam = sc.nextDouble();
		System.out.println("Enter the transcation amount");
		double tam = sc.nextDouble();
		System.out.println("Enter the transcation code");
		char tcode = sc.next().charAt(0);
		double netba;
		netba = cam - tam;
		System.out.println(netba);

	}

}
