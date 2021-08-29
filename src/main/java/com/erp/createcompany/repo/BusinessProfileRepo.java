package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.createcompany.model.BusinessProfile;

public interface BusinessProfileRepo extends JpaRepository<BusinessProfile, Integer> {

}
