
package com.erp.store.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.store.model.Product;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "product",path="product")
public interface ProductRepository extends JpaRepository<Product,Integer> {

}