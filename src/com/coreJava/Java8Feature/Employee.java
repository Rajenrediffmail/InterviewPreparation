package com.coreJava.Java8Feature;

import java.util.Date;
/**
 * The Employee class represents an employee with various attributes such as id, name, department, position
 * 
 */
public class Employee {

	private int id;
	private String name;
	private String department;
	private String position;
	private String email;
	private long phoneNumber;
	private Address address;
	private String dateOfJoining;
	private Date dateOfBirth;
	private double salary;

	// generate parameterized constructor, getters and setters for all fields
	public Employee(int id, String name, String department, String position, String email, long phoneNumber,
			Address address, String dateOfJoining, Date dateOfBirth, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	// genarete few imp parameterized constructor, getters and setters for all
	// fields
	public Employee(int id, String name, String department, String position, String email, long phoneNumber) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	// generate default constructor
	public Employee() {

	}

	// genetare int id, String name, String department, String position, cunstructor
	// for this fields
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;

	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"id=" + id +
			", name='" + name + '\'' +
			", department='" + department + '\'' +
			", position='" + position + '\'' +
			", email='" + email + '\'' +
			", phoneNumber=" + phoneNumber +
			", address=" + address +
			", dateOfJoining='" + dateOfJoining + '\'' +
			", dateOfBirth=" + dateOfBirth +
			", salary=" + salary +
			'}';
	}

	// Private constructor used by the Builder
	private Employee(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.department = builder.department;
		this.position = builder.position;
		this.email = builder.email;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
		this.dateOfJoining = builder.dateOfJoining;
		this.dateOfBirth = builder.dateOfBirth;
		this.salary = builder.salary;
	}

	// Builder for Employee to enable fluent construction
	public static class Builder {
		private int id;
		private String name;
		private String department;
		private String position;
		private String email;
		private long phoneNumber;
		private Address address;
		private String dateOfJoining;
		private Date dateOfBirth;
		private double salary;

		public Builder() {
		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder department(String department) {
			this.department = department;
			return this;
		}

		public Builder position(String position) {
			this.position = position;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder phoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder address(Address address) {
			this.address = address;
			return this;
		}

		public Builder dateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
			return this;
		}

		public Builder dateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

}
