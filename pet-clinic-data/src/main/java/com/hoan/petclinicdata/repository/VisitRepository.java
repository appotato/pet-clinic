package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
}
