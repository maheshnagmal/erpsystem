package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erp.createcompany.model.Units;

@RepositoryRestResource(collectionResourceRel = "units", path = "units")
public interface UnitsRepo extends JpaRepository<Units, Integer> {

}
