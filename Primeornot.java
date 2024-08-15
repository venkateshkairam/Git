package Conditional_program;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, count = 0, flag = 0;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		/*
		 * i=1; while(i<=n) { if(n%i==0) count++; i++;
		 *
		 * } if(count==2)
		 *
		 * System.out.println(n+ " "+"is a prime number"); else
		 * System.out.println(n+" "+"is not a prime number"); }
		 *
		 * }
		 */

		i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 0) {
			System.out.println(n + " " + "is a prime number");
		} else {
			System.out.println(n + " " + "is a not a prime number");
		}
	}

}
