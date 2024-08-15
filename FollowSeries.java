package Conditional_program;

import java.util.Scanner;

public class FollowSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, k = 0;

		System.out.print("Enter the value of n");
		n = sc.nextInt();

		k = k - n;
		n = n + 1;

		while (k != n) {
			System.out.print(Math.abs(k) + " ");
			k++;
		}
	}

}
