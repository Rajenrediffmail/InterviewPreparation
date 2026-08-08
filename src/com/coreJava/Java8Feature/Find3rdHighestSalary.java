package com.coreJava.Java8Feature;

import java.util.Comparator;
import java.util.List;

public class Find3rdHighestSalary 
{
    
    public static void main(String[] args) 
    {
        List<Employee> employees = List.of(
            new Employee("John", 60000),
            new Employee("Alice", 75000),
            new Employee("Bob", 55000),
            new Employee("Eve", 80000),
            new Employee("Charlie", 70000)
        );

        double thirdMaxSalary = employees.stream()
							            .sorted(Comparator.comparing(Employee::getSalary).reversed()) // Sort in descending order
							            .skip(2) // Skip the first two (0-based index)
							            .findFirst()
							            .map(Employee::getSalary)
							            .orElse((double) 0); // Handle the case where there might not be a 3rd max salary

        System.out.println("Third Maximum Salary: " + thirdMaxSalary);
        
        employees.stream()
					.sorted(Comparator.comparing(Employee::getSalary).reversed())
					.skip(2)
					.findFirst()
					.ifPresent(employee -> System.out.println("Employee with Third Maximum Salary: " + employee.getName() + ", Salary: " + employee.getSalary()));
        
        //easy way to find 3rd highest salary
        double thirdHighestSalary = employees.stream()
						    					.map(Employee::getSalary)
						    					.distinct()
						    					.sorted(Comparator.reverseOrder())
						    					.skip(2)
						    					.findFirst()
						    					.orElse(0.0);
        // Print the result
        System.out.println("Third Highest Salary (distinct): " + thirdHighestSalary);
        
    }
}

