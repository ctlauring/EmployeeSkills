package com.employeeAPI.employeeskills.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Skill {
    private @Id
    @GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid",
            strategy = "uuid") String id;
    @ManyToMany(cascade = CascadeType.ALL)
    private Field field;
    private int experience;
    private String summary;

    public Skill(Field field, int experience, String summary) {
        this.field = field;
        this.experience = experience;
        this.summary = summary;
    }

    public Skill(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


}
