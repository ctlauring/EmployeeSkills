package com.employeeAPI.employeeskills.dao;

import com.employeeAPI.employeeskills.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, String>{

    @Query(value = "SELECT SKILL.ID, EXPERIENCE, SUMMARY, FIELD_ID FROM SKILL JOIN EMPLOYEE_SKILLS ON SKILL.ID = EMPLOYEE_SKILLS.SKILLS_ID WHERE EMPLOYEE_SKILLS.EMPLOYEE_ID = :employeeId", nativeQuery = true )
    List<Skill> findByEmployeeId(
            @Param("employeeId") String employeeId);

    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO EMPLOYEE_SKILLS (EMPLOYEE_ID, SKILLS_ID) VALUES (:employeeId, :skillId)", nativeQuery = true )
    void addSkillToEmployee(
            @Param("skillId") String skillId,
            @Param("employeeId") String employeeId);

    @Query(value = "SELECT SKILL.ID, EXPERIENCE, SUMMARY, FIELD_ID FROM SKILL JOIN EMPLOYEE_SKILLS ON SKILL.ID = EMPLOYEE_SKILLS.SKILLS_ID WHERE EMPLOYEE_SKILLS.EMPLOYEE_ID = :employeeId AND EMPLOYEE_SKILLS.SKILLS_ID = :skillId", nativeQuery = true )
    Skill findEmployeeSkillBySkillId(
            @Param("employeeId") String employeeId,
            @Param("skillId") String skillId);



}
