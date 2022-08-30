package com.likelion.ecommerce.repository.mybatis;

import com.likelion.ecommerce.model.Customer;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerRepository {
    @Select("select * from CUSTOMER")
    List<Customer> list();
}
