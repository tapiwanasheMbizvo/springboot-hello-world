package com.tapiwanashe.helloworld.service;

import com.tapiwanashe.helloworld.dto.PetDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
class PetServiceTest {


    @Autowired
    private PetService petService;


    @Test
    void testGetPet() {

        PetDto petDto = new PetDto("sango", "russel");

        PetDto petDto1 = petService.savePetDto(petDto);

        assertTrue(petDto1.getPetName().equalsIgnoreCase(petDto.getPetName()));

    }

}