package com.learning.service;

import com.learning.model.Employee;
import com.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by amits on 13/07/16.
 */
@Component
public class DataPopulator implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {
        Employee employee = new Employee();
        employee.setAge(34);
        employee.setName("John");
        employee.setSalary(45000L);
        employeeRepository.save(employee);
    }
}
