package com.tapiwanashe.helloworld.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tapiwanashe.helloworld.dto.PetDto;
import com.tapiwanashe.helloworld.model.Pet;

@Mapper
public interface PetMapper {
    
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    PetDto modelToDto (Pet pet);

    Pet dtoToModel(PetDto petDto);

}
