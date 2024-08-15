package Conditional_program;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the charcter");
		ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Given charcter is alphabet=" + ch);
		} else {
			System.out.println("Given charcter is not alphabet=" + ch);
		}
	}

}
