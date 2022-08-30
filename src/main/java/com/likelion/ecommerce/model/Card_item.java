package com.likelion.ecommerce.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "card")
@Data
public class Card_item {
    @Id
    @GeneratedValue
    @Column(name = "card_id", nullable = false)
    private Integer cardId;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "quality_wished", nullable = false)
    private Integer qualityWished;

    @Column(name = "date_added", nullable = false)
    private Date dateAdded;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;
}
