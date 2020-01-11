package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Integer> {
    List<Owner> findByLastName(String lastName);
}
