package com.tienvm.ecommerce.service.imp;

import com.tienvm.ecommerce.model.Product;
import com.tienvm.ecommerce.repository.jpa.ProductRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ProductServiceImp {
    @Autowired
    ProductRepositoryJPA productRepositoryJPA;

    @PostConstruct
    public void init(){
        productRepositoryJPA.save(new Product("Giay", "A", "XL",123000));
        productRepositoryJPA.save(new Product("Dep", "A", "XL",27527));
        productRepositoryJPA.save(new Product("Ao", "A", "X",785275));
        productRepositoryJPA.save(new Product("Quan", "A", "M",452000));
        productRepositoryJPA.save(new Product("Ao dai", "A", "XL",515248));
        productRepositoryJPA.save(new Product("Giay chay bo", "C", "XL",7575));
        productRepositoryJPA.save(new Product("Quan dai", "A", "L",123000));
        productRepositoryJPA.save(new Product("Giay the thao", "B", "XL",24424));
        productRepositoryJPA.save(new Product("Ao somi", "A", "XL",2457887));
        productRepositoryJPA.save(new Product("Quan the thao", "A", "XL",275278));
    }
}
