package com.tapiwanashe.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupLogger implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Database User: " + System.getenv("PET_DB_USER"));
    }
    
}
