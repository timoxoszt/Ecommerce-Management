package com.tienvm.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "customer_name",nullable = false)
    private String customerName;

    @Column(name = "address",nullable = false)
    private String customerAddress;

    @Column(name = "phone_no")
    private String customerPhone;

    @Column(name = "card_id")
    private Integer cardId;

    public Customer(String customerName, String customerAddress, String customerPhone, Integer cardId) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.cardId = cardId;
    }
}
