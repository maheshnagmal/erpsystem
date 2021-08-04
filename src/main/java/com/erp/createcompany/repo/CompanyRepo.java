package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.createcompany.model.Company;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "company",path="company")
public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
