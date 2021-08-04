package com.erp.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.store.model.Materials;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "material",path="material")
public interface MaterialRepository extends JpaRepository<Materials, Integer>{

}
