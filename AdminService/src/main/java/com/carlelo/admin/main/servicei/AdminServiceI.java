package com.carlelo.admin.main.servicei;

import java.util.List;

import com.carlelo.admin.main.enums.UserType;
import com.carlelo.admin.main.model.Employee;

public interface AdminServiceI {

	public Employee saveEmployee(Employee emp);
	public Employee loginCheck(String un, String ps);
	public List<Employee> EmployeesList();
	public Employee getSingleEmployee(String username);
	public List<Employee> DeleteEmployee(int empId);
	public Employee updateEmployee(int empId, Employee emp);

}
