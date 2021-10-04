package com.employeeAPI.employeeskills.dao;

import com.employeeAPI.employeeskills.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, String>{


}
