package com.employeeAPI.employeeskills.dao;

import com.employeeAPI.employeeskills.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, String>{

/*    @Query("SELECT * FROM SKILL" +
            " JOIN EMPLOYEE_SKILLS ON SKILLS.ID = EMPLOYEE_SKILLS.SKILLS_ID WHERE employee.employeeId = :employeeId ")
    List<Skill> findByEmployeeId(
            @Param("employeeId") String employeeId);*/
}
