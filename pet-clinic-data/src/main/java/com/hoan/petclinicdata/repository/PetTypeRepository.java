package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Integer> {
}
