package com.coreJava.Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findSecondHigestSalaryusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Emp> listboj= new ArrayList<Emp>();
		
		listboj.add(new Emp(1, 20000));
		listboj.add(new Emp(2, 40000));
		listboj.add(new Emp(3, 70000));
		listboj.add(new Emp(4, 5000));
		listboj.add(new Emp(5, 200));
		
	List empSortedList= listboj.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).limit(1).collect(Collectors.toList());
	
	System.out.println("Max Salary "+empSortedList);
	}

}
