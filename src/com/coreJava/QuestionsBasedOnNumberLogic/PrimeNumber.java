package com.coreJava.QuestionsBasedOnNumberLogic;
import java.util.Iterator;
import java.util.Scanner;

/*A Prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * It means it is only divisible by 1 and itself, and it start from 2. The smallest prime number is 2.
 *  Here i will show you how to write this program*/
public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value..");
        int inputNumber=scanner.nextInt();
		        	
        findPrimeNumber(inputNumber);
		       
       scanner.close();
       
	}	
	public synchronized static void  findPrimeNumber(int inputNumber)
	{
		int checkDividedByLessThenTwo=0;
		
		if (inputNumber==1 || inputNumber==0)
		{
			System.out.println("Number: "+ inputNumber + " Smallest Prime is 2");
			
		}else 
		{
			
			for (int j = 1; j <= inputNumber; j++)
			{
				if (inputNumber % j == 0)  // if number divisible and reminder is zero then that's not a prime number;
				{
					checkDividedByLessThenTwo++;
					
				}
			}
			if (checkDividedByLessThenTwo == 2) 
			{
		    	System.out.println("Number: "+ inputNumber + " a Prime!");
			}else 
			{
				System.out.println("Number: "+ inputNumber + " Not a Prime!");
			}
			
			
		}
		
		
	}
}


//Enter value..
//20
//Number: 0 Smallest Prime is 2
//Number: 1 Smallest Prime is 2
//Number: 2 Not a Prime!
//Number: 3 is a Prime! 
//Number: 6 is a Prime! 
//Number: 4 Not a Prime!
//Number: 5 Not a Prime!
//Number: 10 Not a Prime!
//Number: 7 is a Prime! 
//Number: 8 is a Prime! 
//Number: 9 is a Prime! 
//Number: 11 is a Prime! 
//Number: 12 is a Prime! 
//Number: 13 is a Prime! 
//Number: 14 is a Prime! 
//Number: 15 is a Prime! 
//Number: 16 is a Prime! 
//Number: 17 is a Prime! 
//Number: 18 is a Prime! 
//Number: 19 is a Prime! 

