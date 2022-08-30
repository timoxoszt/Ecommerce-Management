package com.likelion.ecommerce.controller;

import com.likelion.ecommerce.model.Customer;
import com.likelion.ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping(value = "/customers")
    public Customer insertCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
