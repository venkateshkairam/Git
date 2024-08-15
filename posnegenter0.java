package Conditional_program;

import java.util.Scanner;

public class posnegenter0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, n, psum = 0, nsum = 0, num;
		System.out.println("Enter the value of n");
		n = sc.nextInt();

		i = 1;
		while (i <= n) {
			System.out.println("Enter the number:");
			num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num > 0) {
				psum = psum + num;
			} else {
				nsum = nsum + num;
			}
			i++;

		}
		System.out.println("sum of Positive numbers=" + psum);
		System.out.println("sum of negative numbers=" + nsum);

	}

}
