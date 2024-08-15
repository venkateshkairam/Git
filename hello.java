package Conditional_program;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Charcter:");
		ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Given charcter is uppercase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Given charcter is lowercase");
		}

	}

}
