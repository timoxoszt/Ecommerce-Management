package com.likelion.ecommerce.service;

import com.likelion.ecommerce.model.Customer;

public interface CustomerService {
    void listCustomer();
    int storeCustomer(Customer customer);
    int updateCustomer(Customer customer);
    int deleteCustomer(long id);
    Customer showCustomer(long id);
}
