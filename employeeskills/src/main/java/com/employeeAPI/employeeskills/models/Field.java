package com.employeeAPI.employeeskills.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Field {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Skill> skills;
    private @Id
    @GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid",
            strategy = "uuid") String id;
    private String name;
    private String type;

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Field(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
