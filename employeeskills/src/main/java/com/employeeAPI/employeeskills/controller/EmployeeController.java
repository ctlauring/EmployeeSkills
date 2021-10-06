package com.employeeAPI.employeeskills.controller;


import java.util.List;
import java.util.UUID;

import com.employeeAPI.employeeskills.dao.EmployeeRepository;
import com.employeeAPI.employeeskills.exceptions.EmployeeNotFoundException;
import com.employeeAPI.employeeskills.exceptions.InvalidIDFormatException;
import com.employeeAPI.employeeskills.models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/employees/{id}")
    Employee one(@PathVariable String id) {

        if (id.length() != 32) {
            throw new InvalidIDFormatException();
        }
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException());
    }
    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {

        if (id.length() != 32) {
            throw new InvalidIDFormatException();
        }

        return repository.findById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setLastName(newEmployee.getLastName());
                    employee.setContactEmail(newEmployee.getContactEmail());
                    employee.setBirthDate(newEmployee.getBirthDate());
                    employee.setHiredDate(newEmployee.getHiredDate());
                    employee.setRole(newEmployee.getRole());
                    employee.setBusinessUnit(newEmployee.getBusinessUnit());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable String id) {

        if (id.length() != 32) {
            throw new InvalidIDFormatException();
        }
        repository.deleteById(id);
    }
}