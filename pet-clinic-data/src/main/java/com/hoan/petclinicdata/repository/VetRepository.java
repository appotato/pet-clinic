package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Integer> {
}
