package com.tapiwanashe.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tapiwanashe.helloworld.dto.PetDto;
import com.tapiwanashe.helloworld.mapper.PetMapper;
import com.tapiwanashe.helloworld.repository.PetRepository;


import lombok.extern.slf4j.Slf4j;

@Service

@Slf4j
public class PetService {
    
    private final PetRepository petRepository;
    private final PetMapper petMapper;

    public PetService(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }


    public List<PetDto> getAllPets(){
        return petRepository.findAll().stream()
        .map(petMapper::modelToDto).toList();
    }

    public Optional<PetDto> getPetById(long petId){

        return  Optional.of(petMapper.modelToDto(petRepository.findById(petId).get()));
    }

    public PetDto savePetDto(PetDto petDto){

        return  petMapper.modelToDto(petRepository.save(petMapper.dtoToModel(petDto)));
    }

    public  void deleteBook(long petId){

        petRepository.deleteById(petId);
    }

    public PetDto updateBookDetails(PetDto petDto){


        return  petMapper.modelToDto(petRepository.save(petMapper.dtoToModel(petDto)));
    }

}
