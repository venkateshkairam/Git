package Conditional_program;

import java.math.BigInteger;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger b = new BigInteger(sc.next());
		if (b.isProbablePrime(1)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
