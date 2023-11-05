package com.coreJava.Java8Feature;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		  List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
          list.stream()
              .filter(n -> n%2 == 0)
              .forEach(System.out::println);

          //n-> n%2 ==0).forEach(System.out::println);
          
          
          //find out all the numbers starting with 1 using Stream functions?
    /*      List.stream()
          .map(s -> s + "") // Convert integer to String
          .filter(s -> s.startsWith("1"))
          .forEach(System.out::println);
          
     */
          
	}

}
