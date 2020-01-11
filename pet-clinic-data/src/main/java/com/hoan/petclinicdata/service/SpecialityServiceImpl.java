package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Specialty;
import com.hoan.petclinicdata.repository.SpecialityRepository;
import com.hoan.petclinicdata.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;

    public SpecialityServiceImpl() {
    }

    @Override
    public Specialty findById(Integer id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Specialty> findAll() {
        return specialityRepository.findAll();
    }

    @Override
    public Specialty save(Specialty speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Specialty speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Integer id) {
        specialityRepository.deleteById(id);
    }
}
