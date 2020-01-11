package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Integer> {
}
