package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erp.createcompany.model.ConversionRate;

@RepositoryRestResource(collectionResourceRel = "conversion", path = "conversion")
public interface ConversionRateRepo extends JpaRepository<ConversionRate, Integer> {

}
