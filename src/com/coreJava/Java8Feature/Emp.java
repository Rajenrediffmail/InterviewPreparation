package com.coreJava.Java8Feature;

public class Emp {
	
	private int empID;
	private int salary;
	
	
	public Emp(int empID, int salary) {
		super();
		this.empID = empID;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", salary=" + salary + "]";
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
