package Conditional_program;

import java.util.Scanner;

public class Digits_into_words {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,rem,rev=0;
	System.out.println("Enter the value of n is:");
	n=sc.nextInt();//4567

	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	//7654
	while(rev>0)//7654>0
	{
		rem=rev%10; //4 5 6 7


		swicth(rem)
		{
			case 0:System.out.println("ZERO");
		         break;

			case 1:System.out.println("ONE");
		          break;

			case 2:System.out.println("TWO");
		          break;

			case 3:System.out.println("THREE");
		          break;

			case 4:System.out.println("FOUR");
		          break;
			case 0:System.out.println("ZERO");
	         break;

		   case 1:System.out.println("ONE");
	          break;

		   case 2:System.out.println("TWO");
	          break;

		   case 3:System.out.println("THREE");
	          break;

		  case 4:System.out.println("FOUR");
	           break;
	 }


	}

}
