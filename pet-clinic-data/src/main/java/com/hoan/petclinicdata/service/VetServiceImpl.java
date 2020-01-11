package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Vet;
import com.hoan.petclinicdata.repository.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class VetServiceImpl implements VetService {

    @Autowired
    private VetRepository vetRepository;

    @Override
    public Vet findById(Integer id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vet> findAll() {

        return vetRepository.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Integer id) {
        vetRepository.deleteById(id);
    }
}
