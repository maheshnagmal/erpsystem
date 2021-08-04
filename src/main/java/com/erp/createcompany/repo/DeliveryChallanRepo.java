package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.createcompany.model.DeliveryChallan;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "delivery",path="delivery")
public interface DeliveryChallanRepo extends JpaRepository<DeliveryChallan, Integer> {

}
