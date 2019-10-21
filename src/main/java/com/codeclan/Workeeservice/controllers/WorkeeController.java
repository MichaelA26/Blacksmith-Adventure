package com.codeclan.Workeeservice.controllers;

import com.codeclan.Workeeservice.models.Workee;
import com.codeclan.Workeeservice.repositories.WorkeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/workees")

public class WorkeeController {

    @Autowired
    WorkeeRepository workeeRepository;

    @GetMapping
    public List<Workee> getAllWorkees(){
        return workeeRepository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Workee>getWorkeeById(@PathVariable Long id){
        return workeeRepository.findById(id);
    }
}
