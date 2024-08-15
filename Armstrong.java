package Conditional_program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int n = Integer.parseInt(s);
		int last = n % 10;
		int first = (int) (n / Math.pow(10, l - 1));
		int res = (int) (last * Math.pow(10, l - 1));
		res = res + (int) (n % Math.pow(10, l - 1));
		res = res - last + first;
		System.out.println(res);
		sc.close();
	}

}
