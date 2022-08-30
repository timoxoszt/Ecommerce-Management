package com.likelion.ecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "customer_name", nullable = false, length = 50)
    private String cutomerName;

    @Column(name = "address", length = 100)
    private String customerAddress;

    @Column(name = "phone_no", length = 20, nullable = false)
    private String customerPhone;

    @Column(name = "card_id", nullable = false)
    private Integer cardId;

    public Customer(String cutomerName, String customerAddress, String customerPhone, Integer cardId) {
        this.cutomerName = cutomerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.cardId = cardId;
    }
}
