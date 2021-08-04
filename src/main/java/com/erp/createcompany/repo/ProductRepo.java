package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.createcompany.model.Product;



@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "productC",path="productC")
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

