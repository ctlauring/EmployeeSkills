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

        ArrayList<Skill> skillsList2 = new ArrayList<>();
        skillsList2.add(new Skill(new Field("Archeology", "new"), 4, "Fossils"));
        skillsList2.add(new Skill(new Field("Research", "old"), 6, "Books"));
        skillsList2.add(new Skill(new Field("IT", "not new"), 2, "Computers"));

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Chace", "Lauring", new Address("wah street", "suite 1", "Detroit", "MI", "19183", "US"), "wah@gmail.com", "7/17/1994",
                    "10/04/2021", "Developer", "Information Technology", skillsList)));
            log.info("Preloading " + repository.save(new Employee("Pierce", "Lauring", new Address("where street", "suite 2", "Bloomfield Hills", "MI", "48921", "US"), "who@gmail.com", "2/21/1921",
                    "16/09/2021", "Manager", "Information Technology", skillsList2)));
        };
    }
}