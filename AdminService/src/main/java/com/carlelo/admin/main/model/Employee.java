package com.carlelo.admin.main.model;

import com.carlelo.admin.main.enums.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String username;
	private String password;
	private int age;
	private String address;
	private String email;
	@Enumerated(EnumType.STRING)
	private UserType userType;


	

}
