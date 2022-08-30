package com.likelion.ecommerce.service;

import com.likelion.ecommerce.model.Product;

public interface ProductService {
    void listProduct();
    int storeProduct(Product product);
    int updateProduct(Product product);
    int deleteProduct(long id);
    Product showProduct(long id);
}
