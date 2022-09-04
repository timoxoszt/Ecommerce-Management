package com.tienvm.ecommerce.service.imp;

import com.tienvm.ecommerce.model.Product;
import com.tienvm.ecommerce.repository.jpa.ProductRepositoryJPA;
import com.tienvm.ecommerce.repository.mybatis.ProductRepositoryMybatis;
import com.tienvm.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepositoryJPA productRepositoryJPA;

    @PostConstruct
    public void init(){
        productRepositoryJPA.save(new Product("Giay", "A", "XL",123000,40091290));
        productRepositoryJPA.save(new Product("Dep", "A", "XL",27527,60000));
        productRepositoryJPA.save(new Product("Ao", "A", "X",785275, 827312312));
        productRepositoryJPA.save(new Product("Quan", "A", "M",452000,12123123));
        productRepositoryJPA.save(new Product("Ao dai", "A", "XL",515248,8123123));
        productRepositoryJPA.save(new Product("Giay chay bo", "C", "XL",7575,7812312));
        productRepositoryJPA.save(new Product("Quan dai", "A", "L",123000,323452));
        productRepositoryJPA.save(new Product("Giay the thao", "B", "XL",24424,12378123));
        productRepositoryJPA.save(new Product("Ao somi", "A", "XL",2457887,871212));
        productRepositoryJPA.save(new Product("Quan the thao", "A", "XL",275278,71237172));
    }

    @Resource
    ProductRepositoryMybatis productRepositoryMybatis;

    public List<Product> getAllProduct(BigDecimal price, String condition){
        List<Product> products;
        if(price==null || condition==null)
            products = productRepositoryMybatis.getAllProduct();
        else
            switch (condition) {
                case "LESS_THAN":
                    products = productRepositoryMybatis.getAllProductLess(price);
                case "GREATER_THAN":
                    products = productRepositoryMybatis.getAllProductGreater(price);
                case "EQUAL":
                    products = productRepositoryMybatis.getAllProductEqual(price);
                default:
                    products = null;
            }
        return products;
    }
}
