package com.coreJava.QuestionsBasedOnStringOperartion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsVowels {

	public static void main(String[] args) {

		System.out.println("Enter String: ");
		Scanner scan = new Scanner(System.in);
			String input=scan.next();
	
		boolean output= findVowel(input);
		
		if (output) {
			System.out.println("String "+input+ " is contain vowel");
		}else {
			System.out.println("String "+input+ " is  not contain vowel");
		}
	
		 scan.close();
	}
	
	
	public static boolean findVowel(String str)
	{
		if(str==null || str.equals(""))
		{
			throw new IllegalArgumentException("Null or empty string not allowed");
		}else 
		{
//			String regex = "[aeiouAEIOU]";
//			Pattern pattern= Pattern.compile(regex);
//			Matcher matcher = pattern.matcher(str);
//			return matcher.find();
			return str.matches(".*[aeiouAEIOU].*"); //.*
		}
	}
}


//Enter String: 
//Rajendra
//String Rajendra is contain vowel

//Enter String: 
//rqgdhy
//String rqgdhy is  not contain vowel