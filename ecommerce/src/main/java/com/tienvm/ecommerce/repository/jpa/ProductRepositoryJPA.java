package com.tienvm.ecommerce.repository.jpa;

import com.tienvm.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJPA extends JpaRepository<Product, Long> {
}
