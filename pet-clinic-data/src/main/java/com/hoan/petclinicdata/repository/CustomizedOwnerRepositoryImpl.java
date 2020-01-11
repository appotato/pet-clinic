package com.hoan.petclinicdata.repository;

import com.hoan.petclinicdata.model.Owner;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class CustomizedOwnerRepositoryImpl implements CustomizedOwnerRepository {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Owner> findByLastName(String lastName) {
        Session currentSesstion = entityManager.unwrap(Session.class);

        Query<Owner> query = currentSesstion.createQuery("from Owner o where o.lastName=:lastName", Owner.class);

        query.setParameter("lastName", lastName);

        return query.getResultList();
    }
}
