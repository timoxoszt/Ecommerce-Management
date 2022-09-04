package com.tienvm.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CardItem {
    @Id
    @GeneratedValue
    @Column(name = "card_id", nullable = false)
    private Integer cardId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quality_wished", nullable = false)
    private Integer qualityWished;

    @Column(name = "date_added", nullable = false)
    private Date dateAdded;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;
}
