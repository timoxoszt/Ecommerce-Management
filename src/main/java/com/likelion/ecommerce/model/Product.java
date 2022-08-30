package com.likelion.ecommerce.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "name_product", length = 100, nullable = false)
    private String productName;

    @Column(name = "type", length = 3)
    private String productType;

    @Column(name = "size", length = 3)
    private String productSize;

    @Column(name = "price", nullable = false)
    private BigDecimal productPrice;

    public Product(String productName, String productType, String productSize, int productPrice) {
        this.productName = productName;
        this.productType = productType;
        this.productSize = productSize;
        this.productPrice = BigDecimal.valueOf(productPrice);
    }
}
