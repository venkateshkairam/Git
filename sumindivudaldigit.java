package Conditional_program;

import java.util.Scanner;

public class sumindivudaldigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 1, sum = 0, j = 0;
		System.out.println("Enter the value of n:");
		n = sc.nextInt();
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		// n=n*(n+1)/2;
		while (sum > 0) {
			j = j + (sum % 10);
			sum = sum / 10;
		}
		System.out.println(j);
	}

}
