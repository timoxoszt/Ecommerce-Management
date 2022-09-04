package com.tienvm.ecommerce.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CARD")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue
    @Column(name = "card_id")
    private Integer cardId;
}
