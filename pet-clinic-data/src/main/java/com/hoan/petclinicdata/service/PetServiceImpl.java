package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Pet;
import com.hoan.petclinicdata.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet findById(Integer id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pet> findAll() {

        return petRepository.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Integer id) {
        petRepository.deleteById(id);
    }
}
