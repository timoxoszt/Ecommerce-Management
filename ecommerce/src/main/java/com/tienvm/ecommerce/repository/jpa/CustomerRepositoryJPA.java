package com.tienvm.ecommerce.repository.jpa;

import com.tienvm.ecommerce.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryJPA extends JpaRepository<Customer, Long> {
}
