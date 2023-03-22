package com.example.onlinestore.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products", schema = "store_schema")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fullName;
    private String category;
    private int price;
    @Column(columnDefinition="TEXT", length = 2048)
    private String description;
    @Column(columnDefinition="TEXT", length = 2048)
    private String imageUrls;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imageUrls='" + imageUrls + '\'' +
                '}';
    }
}
