package com.coreJava.QuestionsBasedOnNumberLogic;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args)
	{
		 int devideByuptoI,inputNumber,checkPrime, i;
	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the number value : ");
	       
	       inputNumber=scanner.nextInt();
	       
	       System.out.println("Prime numbers : ");
	       for(i=2;i<=inputNumber;i++)
	       {
		          checkPrime=0;
		          
		          for(devideByuptoI=1; devideByuptoI <= i; devideByuptoI++)// if we check only onenumber only oneloop require
		          {
			             if(i % devideByuptoI == 0) //reminder 0 indicate it's divisible
			             {
			                checkPrime++;
			             }
		          }
		          
		          if(checkPrime == 2 ) // 2 indicate divide number divide 1 or itself if its divide by other number and reminder is 
		        	                   // then it's not a prime number
		          {
		        	  System.err.println("Number: "+ i + " is a Prime! ");
		          }else 
		          {
		        	  System.out.println("Number: "+ i + " Not a Prime! ");
		          }
	       }
	    }

	

}

//Enter the number value : 20
//Prime numbers : 
//Number: 4 Not a Prime! 
//Number: 6 Not a Prime! 
//Number: 8 Not a Prime! 
//Number: 9 Not a Prime! 
//Number: 10 Not a Prime! 
//Number: 12 Not a Prime! 
//Number: 14 Not a Prime! 
//Number: 15 Not a Prime! 
//Number: 16 Not a Prime! 
//Number: 18 Not a Prime! 
//Number: 20 Not a Prime! 
//Number: 2 is a Prime! 
//Number: 3 is a Prime! 
//Number: 5 is a Prime! 
//Number: 7 is a Prime! 
//Number: 11 is a Prime! 
//Number: 13 is a Prime! 
//Number: 17 is a Prime! 
//Number: 19 is a Prime! 
