package com.coreJava.QuestionsBasedOnNumberLogic;
import java.util.Scanner;

/*A Prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * It means it is only divisible by 1 and itself, and it start from 2. The smallest prime number is 2.
 *  Here i will show you how to write this program*/
public class PrimeNumber {
	public static void main(String[] args)
	{
		boolean isPrime=true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value..");
		
        int no=scanner.nextInt();
			if(no==1)
			{
				System.out.println("Smallest Prime number is 2");
			}
			for(int i=2; i<no; i++)
			{
			     if(no%i==0)
			     {
			       System.out.println("Not Prime");
			       isPrime=false;  // if number divisible and reminder is zero then that's not a prime number;
			       break;
			      }
			}
		    if(isPrime == true)
		    {
		    System.out.println("Prime");
		    }
       scanner.close();
	}
}
