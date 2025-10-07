package com.webflux.reactive.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("products")
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;
}
