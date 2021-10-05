package com.employeeAPI.employeeskills.controller;


import java.util.List;

import com.employeeAPI.employeeskills.dao.SkillRepository;
import com.employeeAPI.employeeskills.exceptions.SkillNotFoundException;
import com.employeeAPI.employeeskills.models.Skill;
import org.springframework.transaction.annotation.Transactional;
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

   @GetMapping("/employees/{employeeId}/skills")
    List<Skill> getSkillsByEmployeeId(@PathVariable String employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Transactional
    @PostMapping("/employees/{employeeId}/skills")
    Skill postSkill(@RequestBody Skill newSkill, @PathVariable String employeeId ) {
        newSkill = repository.save(newSkill);
        repository.addSkillToEmployee(newSkill.getId(), employeeId);
        return newSkill;
    }

    @GetMapping("/employees/{employeeId}/skills/{skillId}")
    Skill getEmployeeSkillBySkillId(@PathVariable String employeeId,@PathVariable String skillId) {
        Skill foundSkill = repository.findEmployeeSkillBySkillId(employeeId, skillId);
        if (foundSkill != null) {
            return foundSkill;
        } else {
            throw new SkillNotFoundException(employeeId, skillId);
        }
    }

    @PutMapping("/employees/{employeeId}/skills/{skillId}")
    Skill replaceSkill(@RequestBody Skill newSkill, @PathVariable String employeeId,@PathVariable String skillId) {
        Skill existingSkill = repository.findEmployeeSkillBySkillId(employeeId, skillId);
        if (existingSkill != null) {
            return repository.findById(skillId)
                    .map(skill -> {
                        skill.setField(newSkill.getField());
                        skill.setExperience(newSkill.getExperience());
                        skill.setSummary(newSkill.getSummary());
                        return repository.save(skill);
                    }).orElseGet(() -> {
                        throw new SkillNotFoundException(employeeId,skillId);
                    });
        } else {
            throw new SkillNotFoundException(employeeId, skillId);
        }
    }


    @DeleteMapping("/employees/{employeeId}/skills/{skillId")
    void deleteSkill(@PathVariable String employeeId,@PathVariable String skillId) {
        Skill existingSkill = repository.findEmployeeSkillBySkillId(employeeId, skillId);
        if (existingSkill != null) {
                        throw new SkillNotFoundException(employeeId, skillId);
                    }
        repository.deleteById(skillId);
    }
}