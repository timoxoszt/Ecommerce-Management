package com.likelion.ecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "card")
@Data
public class Card {
    @Id
    @GeneratedValue
    @Column(name = "card_id", nullable = false)
    private Integer cardId;
}
