package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomizedOwnerRepository {
    public List<Owner> findByLastName(String lastName);
}
