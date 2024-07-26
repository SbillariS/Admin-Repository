package com.carlelo.admin.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlelo.admin.main.model.Employee;
import java.util.List;
import com.carlelo.admin.main.enums.UserType;



public interface AdminRepository extends JpaRepository<Employee, Integer>{
   public Employee findByUsernameAndPassword(String username, String password);
   public Employee  findByUsername(String username);
}
