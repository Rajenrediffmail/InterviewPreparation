package com.coreJava.Java8Feature;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayWithEmployee {

	public static void main(String[] args) {
		// sample employees with dateOfJoining set (ISO format)
		Employee e1 = new Employee.Builder()
				.id(1)
				.name("John Doe")
				.department("IT")
				.position("Developer")
				.email("john.doe@mail.com")
				.phoneNumber(1111111111L)
				.address(new Address("123 Main St", "Anytown", "CA", "12345"))
				.salary(55000.0)
				.dateOfJoining("2018-03-15")
				.build();

		Employee e2 = new Employee.Builder()
				.id(2)
				.name("Jane Smith")
				.department("HR")
				.position("Recruiter")
				.email("jane.smith@mail.com")
				.phoneNumber(2222222222L)
				.address(new Address("456 Oak Ave", "Othertown", "NY", "54321"))
				.salary(48000.0)
				.dateOfJoining("2019-07-01")
				.build();

		Employee e3 = new Employee.Builder()
				.id(3)
				.name("Alice Brown")
				.department("IT")
				.position("Senior Developer")
				.email("alice.brown@mail.com")
				.phoneNumber(3333333333L)
				.address(new Address("789 Pine Rd", "Sometown", "TX", "67890"))
				.salary(75000.0)
				.dateOfJoining("2015-10-20")
				.build();

		Employee e4 = new Employee.Builder()
				.id(4)
				.name("Bob Green")
				.department("Finance")
				.position("Analyst")
				.email("bob.green@mail.com")
				.phoneNumber(4444444444L)
				.address(new Address("321 Elm St", "Anycity", "FL", "11223"))
				.salary(62000.0)
				.dateOfJoining("2021-01-10")
				.build();

		Employee e5 = new Employee.Builder()
				.id(5)
				.name("Carol White")
				.department("IT")
				.position("QA")
				.email("carol.white@mail.com")
				.phoneNumber(5555555555L)
				.address(new Address("654 Spruce Ln", "Newtown", "WA", "33445"))
				.salary(47000.0)
				.dateOfJoining("2020-06-30")
				.build();

		Employee e6 = new Employee.Builder()
				.id(6)
				.name("Dave Black")
				.department("HR")
				.position("HR Manager")
				.email("dave.black@mail.com")
				.phoneNumber(6666666666L)
				.address(new Address("987 Cedar Blvd", "Oldtown", "OR", "55667"))
				.salary(82000.0)
				.dateOfJoining("2012-11-05")
				.build();

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);

		// Demonstrations for many Java 8 interview questions. Each method shows a typical usage
		System.out.println("1. Names: " + listEmployeeNames(employees));
		//add proper gap between the output of each method for better readability
		System.out.println("--------------------------------------------------");
		System.out.println("2. Average salary: " + averageSalary(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("3. Max salary employee: " + maxSalaryEmployee(employees).orElse(null));
		System.out.println("--------------------------------------------------");
		System.out.println("4. Group by dept: " + groupByDepartment(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("5. Count by dept: " + countByDepartment(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("6. Emails joined: " + emailsJoined(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("7. Partitioned by 60000: " + partitionBySalary(employees, 60000));
		System.out.println("--------------------------------------------------");
		System.out.println("8. Top 3 highest paid: " + topNHighestPaid(employees, 3));
		System.out.println("--------------------------------------------------");
		System.out.println("9. Map by id (handle duplicates): " + mapByIdHandleDuplicates(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("10. Salary summary: " + salarySummary(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("11. Avg salary by dept: " + avgSalaryByDept(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("12. Unique cities sorted: " + uniqueCitiesSorted(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("13. Sorted by dept then salary: " + sortByDeptThenSalary(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("14. Distinct by name: " + distinctByName(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("15. Highest-paid per dept (optional): " + highestPaidPerDeptOptional(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("16. Any invalid emails? " + anyInvalidEmails(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("17. Duplicate emails: " + findDuplicateEmails(employees));
		System.out.println("--------------------------------------------------");
		System.out.println("18. Median salary by dept: " + medianSalaryByDept(employees));
		System.out.println("--------------------------------------------------");

		// Example: compute years of service (dateOfJoining stored as ISO string)
		System.out.println("19. Years of service per employee:");
		employees.forEach(emp -> System.out.println(emp.getName() + " -> " + yearsOfService(emp)));
		System.out.println("--------------------------------------------------");
		// Example of Optional usage to safely get address city
		Optional<Employee> maybe = employees.stream().filter(e -> e.getId() == 1).findFirst();
		System.out.println("20. Employee 1 city via Optional: " + optionalCityFromOptionalEmp(maybe));
		System.out.println("--------------------------------------------------");
		// Demonstrate promote (immutable-style mapping to new Employee instances)
		System.out.println("21. Promoted developers: " + promotedTo(employees, "Senior Developer", 10.0));
		System.out.println("--------------------------------------------------");
	}

	// Stream & Collector examples

	// 1. map + collect to list of names
	public static List<String> listEmployeeNames(List<Employee> list) {
		return list.stream().map(Employee::getName).collect(Collectors.toList());
	}

	// 2. average salary
	public static double averageSalary(List<Employee> list) {
		return list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
	}

	// 3. max salary
	public static Optional<Employee> maxSalaryEmployee(List<Employee> list) {
		return list.stream().max(Comparator.comparingDouble(Employee::getSalary));
	}

	// 4. grouping by department
	public static Map<String, List<Employee>> groupByDepartment(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}

	// 5. counting per department
	public static Map<String, Long> countByDepartment(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	}

	// 6. joining emails
	public static String emailsJoined(List<Employee> list) {
		return list.stream().map(Employee::getEmail).collect(Collectors.joining(", "));
	}

	// 7. partitioning by salary threshold
	public static Map<Boolean, List<Employee>> partitionBySalary(List<Employee> list, double threshold) {
		return list.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >= threshold));
	}

	// 8. top N highest paid
	public static List<Employee> topNHighestPaid(List<Employee> list, int n) {
		return list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(n).collect(Collectors.toList());
	}

	// 9. toMap with duplicate handling (keeps first)
	public static Map<Integer, Employee> mapByIdHandleDuplicates(List<Employee> list) {
		return list.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (e1, e2) -> e1));
	}

	// 10. summary statistics
	public static DoubleSummaryStatistics salarySummary(List<Employee> list) {
		return list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	}

	// 11. average salary by department
	public static Map<String, Double> avgSalaryByDept(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	}

	// 12. unique cities sorted
	public static List<String> uniqueCitiesSorted(List<Employee> list) {
		return list.stream().map(e -> e.getAddress() == null ? null : e.getAddress().getCity())
				.filter(s -> s != null && !s.isEmpty())
				.distinct().sorted().collect(Collectors.toList());
	}

	// 13. sort by department then salary desc
	public static List<Employee> sortByDeptThenSalary(List<Employee> list) {
		return list.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed()))
				.collect(Collectors.toList());
	}

	// 14. distinct by name (keeps first occurrence)
	public static List<Employee> distinctByName(List<Employee> list) {
		return new ArrayList<>(list.stream().collect(Collectors.toMap(Employee::getName, Function.identity(), (a, b) -> a)).values());
	}

	// 15. highest paid per department (Optional)
	public static Map<String, Optional<Employee>> highestPaidPerDeptOptional(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
	}

	// 16. find any invalid emails
	public static boolean anyInvalidEmails(List<Employee> list) {
		return list.stream().anyMatch(e -> e.getEmail() == null || !e.getEmail().contains("@"));
	}

	// 17. find duplicate emails
	public static Set<String> findDuplicateEmails(List<Employee> list) {
		Map<String, Long> freq = list.stream().collect(Collectors.groupingBy(Employee::getEmail, Collectors.counting()));
		return freq.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
	}

	// 18. median salary by department (collect salaries, sort, compute median)
	public static Map<String, Double> medianSalaryByDept(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.collectingAndThen(Collectors.toList(), salaries -> {
			salaries.sort(Double::compareTo);
			int size = salaries.size();
			if (size == 0) return 0.0;
			if (size % 2 == 1) return salaries.get(size / 2);
			return (salaries.get(size / 2 - 1) + salaries.get(size / 2)) / 2.0;
		}))));
	}

	// 19. compute years of service from dateOfJoining string (ISO yyyy-MM-dd)
	public static int yearsOfService(Employee e) {
		String doj = e.getDateOfJoining();
		if (doj == null || doj.isEmpty()) return 0;
		try {
			LocalDate d = LocalDate.parse(doj, DateTimeFormatter.ISO_LOCAL_DATE);
			return Period.between(d, LocalDate.now()).getYears();
		} catch (Exception ex) {
			return 0;
		}
	}

	// 20. Optional chaining to get city from Optional<Employee>
	public static String optionalCityFromOptionalEmp(Optional<Employee> maybe) {
		return maybe.map(Employee::getAddress).map(Address::getCity).orElse("unknown");
	}

	// 21. promote: return new Employee instances with updated position and increased salary by percent
	public static List<Employee> promotedTo(List<Employee> list, String newPosition, double raisePercent) {
		return list.stream().map(e -> new Employee.Builder()
				.id(e.getId())
				.name(e.getName())
				.department(e.getDepartment())
				.position(newPosition)
				.email(e.getEmail())
				.phoneNumber(e.getPhoneNumber())
				.address(e.getAddress())
				.dateOfJoining(e.getDateOfJoining())
				.dateOfBirth(e.getDateOfBirth())
				.salary(e.getSalary() * (1 + raisePercent / 100.0))
				.build()).collect(Collectors.toList());
	}

	// 22. example reduce vs collect: sum of salaries
	public static double sumSalariesWithReduce(List<Employee> list) {
		return list.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
	}

	public static double sumSalariesWithCollect(List<Employee> list) {
		return list.stream().collect(Collectors.summingDouble(Employee::getSalary));
	}

}
