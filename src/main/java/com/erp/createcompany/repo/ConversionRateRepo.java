package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.createcompany.model.ConversionRate;

public interface ConversionRateRepo extends JpaRepository<ConversionRate, Integer> {

}
