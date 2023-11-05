package com.coreJava.QuestionsBasedOnStringOperartion;

public class ReverseSentancesWordsbyWorldSameSeq 
{
	  public static void main(String[] args) 
	  {
	        String input = "Rajendra Govardhan Waghmare";
	        String[] words = input.split(" ");
	        
	        String reveWordString="";
	        for (String word : words) 
	        {
	            String reversedWord = new StringBuffer(word).reverse().toString();
	            reveWordString = reveWordString+" "+reversedWord;
	        }

	        System.out.println("Reversed String: " + reveWordString);
	    }
}
