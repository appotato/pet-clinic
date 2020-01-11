package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Owner;
import com.hoan.petclinicdata.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public OwnerServiceImpl() {

    }

    @Override
    @Transactional
    public List<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Owner findById(Integer id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAllByOrderByFirstName();
    }


    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        //ownerRepository.delete(owner);

    }

    @Override
    public void deleteById(Integer id) {
        //ownerRepository.deleteById(id);
    }
}
