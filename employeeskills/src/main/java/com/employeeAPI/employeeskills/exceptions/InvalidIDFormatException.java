package com.employeeAPI.employeeskills.exceptions;

public class InvalidIDFormatException extends RuntimeException{
    public InvalidIDFormatException() {
        super("Invalid ID format.");
    }
}
