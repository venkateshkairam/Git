package Conditional_program;

import java.util.Scanner;

public class Sumeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, num, esum = 0, osum = 0;
		System.out.println("Enter the value of n:");
		n = sc.nextInt();
		i = 1;
		while (i < n) {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if (num % 2 == 0) {
				esum = esum + num;
			} else {
				osum = osum + num;
			}
			i++;
		}
		System.out.println("Sum of even numbers=" + esum);
		System.out.println("Sum of odd numbers=" + osum);

	}

}
