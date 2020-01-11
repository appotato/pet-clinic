package com.hoan.petclinicdata.service;

import com.hoan.petclinicdata.model.Visit;
import com.hoan.petclinicdata.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitRepository visitRepository;

    public VisitServiceImpl() {
    }

    @Override
    public Visit findById(Integer id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public List<Visit> findAll() {

        return visitRepository.findAll();
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Integer id) {
        visitRepository.deleteById(id);
    }
}
