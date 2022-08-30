package com.likelion.ecommerce.service.imp;

import com.likelion.ecommerce.model.Customer;
import com.likelion.ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    public void init(){
        customerRepository.save(new Customer("Minh Tien","1, Thu Duc, HCM","09876123",12453));
        customerRepository.save(new Customer("Tien","5, Thu Duc, HCM","09876863",122753));
        customerRepository.save(new Customer("Vi","77, Thu Duc, HCM","098764123",122753));
        customerRepository.save(new Customer("Minh","15, Thu Duc, HCM","098761523",12873));
        customerRepository.save(new Customer("Vi Minh Tien","61, Thu Duc, HCM","098736123",122753));
    }
}
