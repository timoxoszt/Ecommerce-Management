package com.likelion.ecommerce.controller;

import com.likelion.ecommerce.model.Product;
import com.likelion.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping(value = "/products")
    public Product insertProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
