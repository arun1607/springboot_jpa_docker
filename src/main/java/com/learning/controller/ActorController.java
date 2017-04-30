package com.learning.controller;

import com.learning.model.Actor;
import com.learning.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by amitshrivastava on 30/04/17.
 */
@RestController
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;


    @RequestMapping("/actor")
    public List<Actor> getActors() {
        return actorRepository.findAll();
    }
}
