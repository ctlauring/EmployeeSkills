package com.employeeAPI.employeeskills.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Perficient Employee not found.");
    }
}
