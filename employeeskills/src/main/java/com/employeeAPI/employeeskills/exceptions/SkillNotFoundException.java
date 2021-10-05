package com.employeeAPI.employeeskills.exceptions;

public class SkillNotFoundException extends RuntimeException {
    public SkillNotFoundException(String employeeId, String skillId) {
        super("Could not find skill " + skillId + " for employee " + employeeId);
    }
}
