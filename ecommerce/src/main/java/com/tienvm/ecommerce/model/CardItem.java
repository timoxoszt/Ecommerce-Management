package com.tienvm.ecommerce.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "CARD_ITEM")
public class CardItem {
    @Id
    @Column(name = "card_id",nullable = false)
    private Integer cardId;

    @Id
    @Column(name = "product_id",nullable = false)
    private Integer productId;

    @Column(name = "quantity_wished",nullable = false)
    private Integer qualityWished;

    @Column(name = "date_added",nullable = false)
    private Date dateAdded;

    @Column(name = "total_amount",nullable = false)
    private BigDecimal totalAmount;
}
