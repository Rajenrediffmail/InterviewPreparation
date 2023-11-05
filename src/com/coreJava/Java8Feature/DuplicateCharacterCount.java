package com.coreJava.Java8Feature;

import java.security.Identity;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharacterCount 
{
	

	public static void main(String arg[]) {
		
		String str="Rajendra Waghmare";
		
		char[] charArray= str.toCharArray();
		
		Map<Character, Integer> coutCharString= new HashMap<Character, Integer>();
		
		
		for (char c : charArray) {
			
			if (coutCharString.containsKey(c)) {
				
				coutCharString.put(c, coutCharString.get(c)+1);
				
			}else {
				
				coutCharString.put(c, 1);
			}
			
		}
		
		for (Map.Entry<Character, Integer> mapdata : coutCharString.entrySet()) {
			
			
			if (mapdata.getValue()>1) {
				
				System.out.println("Key : "+mapdata.getKey()+" Value: "+mapdata.getValue());
				
			}
		}
		
		// JAVA 8 
		
		
		// Use Java 8 Streams to count duplicate characters
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Iterate through the map to find and print duplicate characters and their counts
        System.out.println("Duplicate characters and their counts:");
        charCountMap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + ": " + value);
            }
        });
		
		
		int intcount=1234444423;
		String intcountStr = String.valueOf(intcount);
		
		Map <Character,Long> resuult= intcountStr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		resuult.forEach((Key,value)->{
			
			if(value>1)
			{
				System.out.println(Key +" = Count : "+ value);
			}
			
		});
	}
	
	// JAVA 8 
	
	
	
	

}
