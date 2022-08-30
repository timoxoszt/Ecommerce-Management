package com.likelion.ecommerce.service.imp;

import com.likelion.ecommerce.model.Product;
import com.likelion.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ProductServiceImpl {
    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void init(){
        productRepository.save(new Product("Giay", "A", "XL",123000));
        productRepository.save(new Product("Dep", "A", "XL",27527));
        productRepository.save(new Product("Ao", "A", "X",785275));
        productRepository.save(new Product("Quan", "A", "M",452000));
        productRepository.save(new Product("Ao dai", "A", "XL",515248));
        productRepository.save(new Product("Giay chay bo", "C", "XL",7575));
        productRepository.save(new Product("Quan dai", "A", "L",123000));
        productRepository.save(new Product("Giay the thao", "B", "XL",24424));
        productRepository.save(new Product("Ao somi", "A", "XL",2457887));
        productRepository.save(new Product("Quan the thao", "A", "XL",275278));
    }
}
