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
    }
}

