package com.learning;

import com.learning.model.Employee;
import com.learning.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringJpaDockerApplication.class)
public class SpringJpaDockerApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testEmployeeDataPopulation() {

        List<Employee> all = employeeRepository.findAll();
        Assert.assertTrue(all.size() > 0);
    }

}
