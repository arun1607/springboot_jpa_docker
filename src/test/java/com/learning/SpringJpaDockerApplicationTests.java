package com.learning;

import com.learning.model.Actor;
import com.learning.repository.ActorRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaDockerApplicationTests {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    public void testEmployeeDataPopulation() {

        List<Actor> all = actorRepository.findAll();
        Assert.assertTrue(all.size() > 0);
    }

}
