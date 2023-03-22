package com.example.onlinestore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carts", schema = "store_schema")
@Getter
@Setter
public class Cart {
    @Id
    private String username;
    private String products;

}
