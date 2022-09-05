package com.tienvm.ecommerce.controller;

import com.tienvm.ecommerce.model.Product;
import com.tienvm.ecommerce.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/product")
    ResponseEntity<List<Product>> listProduct(@Param("price") BigDecimal price,
                                              @Param("condition") String condition){
        List<Product> productList = productService.getAllProduct(price, condition);
            return ResponseEntity.ok(productList);
    }
}
