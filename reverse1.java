package Conditional_program;

import java.util.Scanner;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer(sc.next());
		char t = s.charAt(0);
		s.setCharAt(0, s.charAt(s.length() - 1));
		s.setCharAt(s.length() - 1, t);
		System.out.println(s);
	}

}
