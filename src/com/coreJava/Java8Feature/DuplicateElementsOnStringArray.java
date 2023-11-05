package com.coreJava.Java8Feature;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsOnStringArray {

    public static void main(String[] args) {
    	
      List<String> names = Arrays.asList("Rajendra", "BB", "Waghmare", "Rajendra");
      Map<String,Long> namesCount = names
                                   .stream()
                                   .filter( x -> Collections.frequency(names, x) > 0)
                                   .collect(
                                		   Collectors.groupingBy(
                                		   						Function.identity(), Collectors.counting()
                                		   						)
                                		   );
      System.out.println(namesCount);
  
     //Write a program to print the count of each character in a String? 
    String s="Rajendra Waghmare";
      Map<String, Long> map = Arrays.stream(s.split(""))
              .map(String::toLowerCase)
              .collect(
            		  Collectors.groupingBy(
            				  				str -> str, LinkedHashMap::new, Collectors.counting()
            				  				)
            		  );
      System.out.println(map);
    }
    
    
    
}