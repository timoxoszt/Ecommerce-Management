package com.tienvm.ecommerce.service.imp;

import com.tienvm.ecommerce.model.Customer;
import com.tienvm.ecommerce.repository.jpa.CustomerRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CustomerServiceImp {
    @Autowired
    CustomerRepositoryJPA customerRepositoryJPA;

    @PostConstruct
    public void init(){
        customerRepositoryJPA.save(new Customer("Minh Tien","1, Thu Duc, HCM","09876123",12453));
        customerRepositoryJPA.save(new Customer("Tien","5, Thu Duc, HCM","09876863",122753));
        customerRepositoryJPA.save(new Customer("Vi","77, Thu Duc, HCM","098764123",122753));
        customerRepositoryJPA.save(new Customer("Minh","15, Thu Duc, HCM","098761523",12873));
        customerRepositoryJPA.save(new Customer("Vi Minh Tien","61, Thu Duc, HCM","098736123",122753));
    }
}
