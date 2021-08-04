package com.erp.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.store.model.Product;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "product",path="product")
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
