package com.github.modestto.diocities.states;

import java.util.List;

import com.github.modestto.diocities.states.StateRepository.StatesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")

public class StateResource {

    private StatesRepository repository;

    public StateResource(StatesRepository repository) {
        this.repository = repository;
        
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();

    }



}
