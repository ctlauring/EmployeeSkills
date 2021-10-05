package com.employeeAPI.employeeskills.data;

import com.employeeAPI.employeeskills.dao.EmployeeRepository;
import com.employeeAPI.employeeskills.models.Address;
import com.employeeAPI.employeeskills.models.Employee;
import com.employeeAPI.employeeskills.models.Field;
import com.employeeAPI.employeeskills.models.Skill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
class LoadDatabase {



    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        ArrayList<Skill> skillsList = new ArrayList<>();

        skillsList.add(new Skill(new Field("Field of being skilled", "new"), 2, "Hacking"));
        skillsList.add(new Skill(new Field("Field of being skilled123", "old"), 5, "Hackerman"));
        skillsList.add(new Skill(new Field("Field of not being skilled", "not new"), 7, "Building"));

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Chace", "Lauring", new Address("wah street", "suite 1", "Detroit", "MI", "19183", "US"), "wah@gmail.com", "7/17/1994",
                    "10/04/2021", "yo", "ay", skillsList)));
        };
    }
}