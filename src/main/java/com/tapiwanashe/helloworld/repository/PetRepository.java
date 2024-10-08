package com.tapiwanashe.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tapiwanashe.helloworld.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    
    
}
