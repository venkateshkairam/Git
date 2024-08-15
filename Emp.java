package Conditional_program;

import java.util.Scanner;

class Emp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the empy number is:"); int eno = sc.nextInt();
		 * System.out.println("Enter the Emp name:"); String ename = sc.next();
		 */
		System.out.println("Enter the salary of emp");
		double sal = sc.nextDouble();
		System.out.println("Enter the empy Designation");
		String des = sc.next();
		if (des.equalsIgnoreCase("manager")) {
			sal = sal + sal * 20 / 100;
		} else if (des.equalsIgnoreCase("analyst")) {
			sal = sal + sal * 10 / 100;
		} else {
			sal = sal + sal * 5 / 100;
		}
		System.out.println(sal);
	}

}
