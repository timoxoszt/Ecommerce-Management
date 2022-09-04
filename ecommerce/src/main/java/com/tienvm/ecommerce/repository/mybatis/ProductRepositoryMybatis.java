package com.tienvm.ecommerce.repository.mybatis;

import com.tienvm.ecommerce.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface ProductRepositoryMybatis {
    @Select("SELECT * FROM PRODUCT")
    List<Product> getAllProduct();
    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE = #{price}")
    List<Product> getAllProductEqual(BigDecimal price);

    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE > #{price}")
    List<Product> getAllProductGreater(BigDecimal price);

    @Select("SELECT * FROM PRODUCT d WHERE d.PRICE < #{price}")
    List<Product> getAllProductLess(BigDecimal price);
}
