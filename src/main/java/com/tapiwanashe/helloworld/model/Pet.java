package com.tapiwanashe.helloworld.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pets_tb")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(name = "pet_name", unique = false, nullable = false)
    private String petName;
    
    @Column(name = "pet_description", unique = false, nullable = false)
    private String petDescription;

    public Pet(String jack, String russel) {
        this.petName =jack;
        this.petDescription= russel;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public Pet(){}

    public Pet(Long id, String petName, String petDescription) {
        this.id = id;
        this.petName = petName;
        this.petDescription = petDescription;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", petName='" + getPetName() + "'" +
            ", petDescription='" + getPetDescription() + "'" +
            "}";
    }
    
}
