package com.capgemini.employeeapp.dao;



import java.util.List;

import com.capgemini.employeeapp.model.Employee;

public interface EmployeeDao {
	public List<Employee>findallemployees();
	public Employee findEmployeeById(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public boolean addEmployee(Employee employee);
	public Employee updateemployee(Employee employee);
}
