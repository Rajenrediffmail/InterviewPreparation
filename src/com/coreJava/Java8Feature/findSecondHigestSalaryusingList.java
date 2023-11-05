package com.coreJava.Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findSecondHigestSalaryusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Emp> listboj= new ArrayList<Emp>();
		
		listboj.add(new Emp(1, 20000));
		listboj.add(new Emp(2, 40000));
		listboj.add(new Emp(3, 70000));
		listboj.add(new Emp(4, 5000));
		listboj.add(new Emp(5, 200));
		
		Dep dep = new Dep("IT");
		
	List empSortedList= listboj.
			stream().
			sorted((o1,o2)->o2.getSalary()-o1.getSalary()).
			limit(2).
			collect(Collectors.toList());
	
	// Convert elements to strings and concatenate them, separated by commas
	 String joined = listboj.stream()
	   .map(Object::toString)
	   .collect(Collectors.joining(", "));

	 
	 // Compute sum of salaries of employee
	 int total = listboj.stream()
	   .collect(Collectors.summingInt(Emp::getSalary));
	 System.out.print("Total: "+total);
	 System.out.print("==========================");

	 // Group employees by department
	// Map<Dep, List<Emp>> byDept = listboj.stream()
	 //  .collect(Collectors.groupingBy(Emp::getDepName));

	
	empSortedList.stream().forEach(x->System.out.println(x));
	System.out.println("++++++++++++++++++++++++++++++++++++");
	listboj.stream().map(obj->obj.getSalary()*2).collect(Collectors.toList()).forEach(out->System.out.println(out));
	System.out.println("++++++++++++++++++++++++++++++++++++");
	//System.out.println("Max Salary "+empSortedList);
	
	List<Integer> list= new ArrayList<>();
	

	list.add(23);
	list.add(12);
	list.add(15);
	list.add(20);
	list.add(40);
	
	/*
	 * List s=list.stream().filter(x->x%2==0).collect(Collectors.toList());
	 * 
	 * s.stream().forEach(x->System.out.println(x));
	 */
	
	System.out.println("================================");
	 list.stream().filter(input->input%2==0).collect(Collectors.toList()).forEach(print->System.out.println(print));
	 System.out.println("================================");
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	 
	 //map all object to squere using 8
	 list.stream().map(input->input*input).collect(Collectors.toList()).forEach(print->System.out.println(print));
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
