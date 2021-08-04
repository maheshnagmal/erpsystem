package com.erp.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.store.model.Supplier;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "supplier",path="supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
