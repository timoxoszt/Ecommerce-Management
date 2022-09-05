package com.tienvm.ecommerce.repository.mybatis;

import com.tienvm.ecommerce.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface ProductRepositoryMybatis {
    @Select("SELECT * FROM PRODUCT")
    @Results({
            @Result(property ="productId",column = "product_id"),
            @Result(property ="nameProduct",column = "name_product"),
            @Result(property ="type",column = "type"),
            @Result(property ="size",column = "size"),
            @Result(property ="quantity",column = "quantity"),
            @Result(property ="price",column = "price"),
    })
    List<Product> getAllProduct();
    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE = #{price}")
    @Results({
            @Result(property ="productId",column = "product_id"),
            @Result(property ="nameProduct",column = "name_product"),
            @Result(property ="type",column = "type"),
            @Result(property ="size",column = "size"),
            @Result(property ="quantity",column = "quantity"),
            @Result(property ="price",column = "price"),
    })
    List<Product> getAllProductEqual(BigDecimal price);

    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE > #{price}")
    @Results({
            @Result(property ="productId",column = "product_id"),
            @Result(property ="nameProduct",column = "name_product"),
            @Result(property ="type",column = "type"),
            @Result(property ="size",column = "size"),
            @Result(property ="quantity",column = "quantity"),
            @Result(property ="price",column = "price"),
    })
    List<Product> getAllProductGreater(BigDecimal price);

    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE < #{price}")
    @Results({
            @Result(property ="productId",column = "product_id"),
            @Result(property ="nameProduct",column = "name_product"),
            @Result(property ="type",column = "type"),
            @Result(property ="size",column = "size"),
            @Result(property ="quantity",column = "quantity"),
            @Result(property ="price",column = "price"),
    })
    List<Product> getAllProductLess(BigDecimal price);
}
