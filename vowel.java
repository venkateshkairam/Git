package Conditional_program;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the charcter");
		s = sc.next().toLowerCase();
		char ch = s.charAt(0);
		// ch=(ch>=65 && ch<=90)? (char) (ch+32) : ch;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given charcter is vowels");

		} else {
			System.out.println("Given charcter is not a vowel");
		}
	}

}
