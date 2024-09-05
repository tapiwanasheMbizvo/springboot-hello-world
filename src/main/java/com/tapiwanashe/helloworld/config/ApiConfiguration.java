package com.tapiwanashe.helloworld.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tapiwanashe.helloworld.mapper.PetMapper;

@Configuration
public class ApiConfiguration {
    @Bean
    public PetMapper petMapper(){
        return Mappers.getMapper(PetMapper.class);
    }
}
