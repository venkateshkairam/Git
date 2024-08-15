package Conditional_program;

import java.util.Scanner;

public class tm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sno = sc.nextInt();
		String sname = sc.nextLine();
		int tm = sc.nextInt();
		if (tm > 360) {
			System.out.println("First Class");
		} else if (tm >= 300) {
			System.out.println("Second Class");
		} else {
			System.out.println("Third Class");
		}
	}

}
