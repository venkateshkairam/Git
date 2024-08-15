package Conditional_program;

import java.util.Scanner;

public class SwapFist_last_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, temp, mul = 1;
		System.out.println("Enter ");
		n = sc.nextInt();
		temp = n;// n=12345
		int last = n % 10;// 5
		int i = last;
		while (temp > 0) { // 12345>0)
			mul = mul * 10;// 100000
			last = last * 10;// 50 500 5000 50000 500000
			temp = temp / 10;// 1234 123 12 1
		}

		mul = mul / 10;// mul=100000/10=10000
		int first = n / mul;// 1
		last = last / 10;// 50000

		int midle = n % mul; // 12345%10000=2345
		last = (last + midle) - i;// (n%10)
		last = last + first;
		System.out.println(last);

		/*
		 * count=count-2; while(count>0) {//count=3 int d=count; mul=1; while(d>0){
		 * mul=mul*10; d--; } e=n/mul; }
		 */
	}
}