package com.tienvm.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "address")
    private String customerAddress;

    @Column(name = "phone_no", nullable = false)
    private String customerPhone;

    @OneToOne
    @JoinColumn(name = "card_id")
    private Card card;
}
