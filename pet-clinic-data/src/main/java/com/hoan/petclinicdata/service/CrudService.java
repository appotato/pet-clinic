package com.hoan.petclinicdata.service;

import java.util.List;
import java.util.Set;

public interface CrudService<Entity, ID> {
    Entity findById(ID id);

    List<Entity> findAll();

    Entity save(Entity entity);

    void delete(Entity entity);

    void deleteById(ID id);
}
