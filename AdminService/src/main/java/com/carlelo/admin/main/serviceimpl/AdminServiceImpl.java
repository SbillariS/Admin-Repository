package com.carlelo.admin.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlelo.admin.main.enums.UserType;
import com.carlelo.admin.main.model.Employee;
import com.carlelo.admin.main.repository.AdminRepository;
import com.carlelo.admin.main.servicei.AdminServiceI;
@Service
public class AdminServiceImpl implements AdminServiceI{
	
	@Autowired AdminRepository adrepo;

	@Override
	public Employee saveEmployee(Employee emp) {
		return adrepo.save(emp);
	}

	@Override
	public Employee loginCheck(String un, String ps) {
		return adrepo.findByUsernameAndPassword(un, ps);
	}

	@Override
	public List<Employee> EmployeesList() 
	{
		return adrepo.findAll();
	}

	@Override
	public Employee getSingleEmployee(String username) 
	{
		return adrepo.findByUsername(username);	
	}

	@Override
	public List<Employee> DeleteEmployee(int empId)
	{
		adrepo.deleteById(empId);
		return adrepo.findAll();
	}

	@Override
	public Employee updateEmployee(int empId,Employee emp) 
	{
		Optional<Employee> op=adrepo.findById(empId);
		if(op.isPresent())
		{
			return adrepo.save(emp);

		}
		return null;
	}

}
