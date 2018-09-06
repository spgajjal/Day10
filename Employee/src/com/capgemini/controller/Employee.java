package com.capgemini.controller;

public class Employee {
private String employeeName;
private  double employeesalary;
private  String employeeDepartment;
private int employeeNumber;
public Employee(String employeeName, double employeesalary, String employeeDepartment, int employeeNumber) {
	super();
	this.employeeName = employeeName;
	this.employeesalary = employeesalary;
	this.employeeDepartment = employeeDepartment;
	this.employeeNumber = employeeNumber;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeesalary() {
	return employeesalary;
}
public void setEmployeesalary(double employeesalary) {
	this.employeesalary = employeesalary;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public int getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(int employeeNumber) {
	this.employeeNumber = employeeNumber;
}
public static void add(Employee e1) {
	// TODO Auto-generated method stub
	
}


}
