package com.softtek.model;

public class Employee {
 
	private int empno;
	private String name;
	private double phNum;
	private String address;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhNum() {
		return phNum;
	}

	public void setPhNum(double phNum) {
		this.phNum = phNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
