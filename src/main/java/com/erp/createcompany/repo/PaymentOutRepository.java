package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erp.createcompany.model.PaymentOut;


@RepositoryRestResource(collectionResourceRel = "paymentout",path="paymentout")
public interface PaymentOutRepository extends JpaRepository<PaymentOut, Integer> {

}
