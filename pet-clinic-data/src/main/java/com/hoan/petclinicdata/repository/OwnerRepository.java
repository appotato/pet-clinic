package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Integer>, CustomizedOwnerRepository {

    public List<Owner> findAllByOrderByFirstName();
}
