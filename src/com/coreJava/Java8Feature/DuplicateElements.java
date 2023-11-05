package com.coreJava.Java8Feature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
  public static void main(String args[]) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          Set<Integer> set = new HashSet();
          myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
          
          // n-> !set.add(n)
          
          //find the first element of the list using Stream functions?
          myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
          
//   find the total number of elements present in the list using Stream functions?
          long count =  myList.stream().count();
          
          System.out.println(count); 
          
          //Find the maximum value element present in it using Stream functions?
          
          List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
          int max =  myList.stream()
                           .max(Integer::compare)
                           .get();
          System.out.println(max);  
  }
}
