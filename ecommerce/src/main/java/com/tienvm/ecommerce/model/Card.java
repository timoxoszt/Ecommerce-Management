package com.tienvm.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Card {
    @Id
    @GeneratedValue
    @Column(name = "card_id")
    private Integer cardId;

    @OneToOne(mappedBy = "card")
    private Customer customer;

    @OneToMany(mappedBy = "card")
    @JsonIgnore
    private Set<CardItem> cardItems;
}
