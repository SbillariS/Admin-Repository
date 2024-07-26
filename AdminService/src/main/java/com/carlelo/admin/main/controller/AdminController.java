package com.carlelo.admin.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlelo.admin.main.enums.UserType;
import com.carlelo.admin.main.model.Employee;
import com.carlelo.admin.main.servicei.AdminServiceI;
@CrossOrigin("http://localhost:4200")
@RestController
public class AdminController
{
	@Autowired AdminServiceI admin;
	
     @PostMapping("/addemployee")
     public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp)
     {
    	 Employee savemp= admin.saveEmployee(emp);
		return new ResponseEntity<Employee>(savemp,HttpStatus.CREATED);
     }
     
     @GetMapping("/login/{un}/{ps}")
     public ResponseEntity<Employee> loginCheck(@PathVariable String un,@PathVariable String ps)
     {
    	 Employee viewemp= admin.loginCheck(un,ps);
		return new ResponseEntity<Employee>(viewemp,HttpStatus.OK);
     }
     
     @GetMapping("/getSingleEmployee/{username}")
     public ResponseEntity<Employee> getSingleEmployee(@PathVariable String username)
     {
    	 Employee viewemp= admin.getSingleEmployee(username);
		return new ResponseEntity<Employee>(viewemp,HttpStatus.OK);
     }

     @DeleteMapping("/deleteEmp/{empId}")
     public ResponseEntity<List<Employee>> DeleteEmployee(@PathVariable int empId)
     {
    	 List<Employee> deleteemp= admin.DeleteEmployee(empId);
		return new ResponseEntity<List<Employee>>(deleteemp,HttpStatus.OK);
     }
     
     @PutMapping("/updateEmployee/{empId}")
     public ResponseEntity<Employee> updateEmployee(@PathVariable int empId,@RequestBody Employee emp )
     {
    	 Employee editemp= admin.updateEmployee(empId,emp);
		return new ResponseEntity<Employee>(editemp,HttpStatus.OK);
     }
     
     @GetMapping("/allEmployees")
     public ResponseEntity<List<Employee>> EmployeesList()
     {
    	 List<Employee> viewemps= admin.EmployeesList();
		return new ResponseEntity<List<Employee>>(viewemps,HttpStatus.OK);
     }
}
