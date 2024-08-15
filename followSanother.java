package Conditional_program;

import java.util.Scanner;

public class followSanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		int temp = n;
		while (temp >= 0) {
			System.out.print(temp + " ");
			temp--;
		}
		i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i++;
		}
	}

}
