package com.capg;

public class EmployeeBean {

	private String empName;
	private int id;
	private double salary;
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empName=" + empName + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}
