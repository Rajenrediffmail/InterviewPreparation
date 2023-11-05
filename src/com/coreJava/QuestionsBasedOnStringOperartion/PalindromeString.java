package com.coreJava.QuestionsBasedOnStringOperartion;

import java.util.Scanner;

/*
 *I want reverse string equal to original then thats are palindrome
 * First i want store original string required variable
 * then   reverse string and store another variable
 * then using if condition compared
 */

public class PalindromeString {

	public static void main(String args[])

	{
		String reverseString="";

		Scanner scanner  = new Scanner(System.in);

		System.out.println("Enter String = ");

		String str=scanner.nextLine();

		for(int i = str.length()-1; i>=0 ; i--)
		{
			 reverseString= reverseString+str.charAt(i);

		}
		if(reverseString.equals(str))
		{
			System.out.println("Entered String is Palindrome ");

		}else
		{

			System.out.print("String not palindrome ");
		}

       scanner.close();
	}


}
/*
 *
 * Enter String =
rajendra
String not palindrome


Enter String =
nitin
Entered String is Palindrome

*Enter String =
NEW
String not palindrome

Enter String =
121
Entered String is Palindrome

*/
