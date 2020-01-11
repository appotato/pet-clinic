package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.PetType;
import com.hoan.petclinicdata.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PetTypeServiceImpl implements PetTypeService {

    @Autowired
    private PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl() {
    }


    @Override
    public PetType findById(Integer id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<PetType> findAll() {

        return petTypeRepository.findAll();
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Integer id) {
        petTypeRepository.deleteById(id);
    }
}
