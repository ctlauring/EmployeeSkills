package com.employeeAPI.employeeskills.data;

import com.employeeAPI.employeeskills.dao.EmployeeRepository;
import com.employeeAPI.employeeskills.models.Address;
import com.employeeAPI.employeeskills.models.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Chace", "Lauring", new Address("wah street", "suite 1", "Detroit", "MI", "19183", "US"), "wah@gmail.com", "7/17/1994",
                    "10/04/2021", "yo", "ay")));
        };
    }
}