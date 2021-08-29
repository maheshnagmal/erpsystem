package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.createcompany.model.BusinessProfile;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "businessProfile",path="businessProfile")
public interface BusinessProfileRepo extends JpaRepository<BusinessProfile, Integer> {

}
