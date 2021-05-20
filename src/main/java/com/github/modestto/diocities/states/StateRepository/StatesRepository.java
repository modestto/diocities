package com.github.modestto.diocities.states.StateRepository;

import com.github.modestto.diocities.states.State;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StatesRepository extends JpaRepository<State,Long> {
    
}
