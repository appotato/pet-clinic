package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Specialty, Integer> {
}
