package com.tienvm.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "name_product", nullable = false)
    private String nameProduct;

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private String size;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    Set<CardItem> cardItems;
}
