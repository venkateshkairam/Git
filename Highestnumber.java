package Conditional_program;

import java.util.Scanner;

public class Highestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, rem, highest = 0;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		while (n > 0)// 1234568
		{
			rem = n % 10;// 8 6
			if (rem > highest) { // 8>0 6>0
				highest = rem;// 8 6
			}
			n = n / 10;// 123456
		}
		System.out.println(highest);

	}

}
