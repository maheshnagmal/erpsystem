package com.erp.store.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.store.model.Supplier;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "supplier",path="supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
/*@Query(value="select supplier_name from SUPPLIER",nativeQuery=true)
List<String> findBySupplierName();
*/
}