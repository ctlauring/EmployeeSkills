package com.employeeAPI.employeeskills.controller;


import java.util.List;

import com.employeeAPI.employeeskills.dao.SkillRepository;
import com.employeeAPI.employeeskills.exceptions.EmployeeNotFoundException;
import com.employeeAPI.employeeskills.models.Employee;
import com.employeeAPI.employeeskills.models.Skill;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SkillController {

    private final SkillRepository repository;

    SkillController(SkillRepository repository) {
        this.repository = repository;
    }

/*    @GetMapping("/employees/{employeeId}/skills")
    List<Skill> getSkillsByEmployeeId(@PathVariable String employeeId) {
        return repository.findByEmployeeId(employeeId);
    }*/

/*
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable String id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {

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
        repository.deleteById(id);
    }*/
}