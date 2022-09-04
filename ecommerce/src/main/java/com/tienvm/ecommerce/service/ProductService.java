package com.tienvm.ecommerce.service;

import com.tienvm.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct(BigDecimal price, String condition);
}
