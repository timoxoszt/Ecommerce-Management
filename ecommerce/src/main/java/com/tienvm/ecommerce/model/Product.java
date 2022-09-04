package com.tienvm.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id",nullable = false)
    private Integer productId;

    @Column(name = "name_product",nullable = false)
    private String nameProduct;

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private String size;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal price;
}
