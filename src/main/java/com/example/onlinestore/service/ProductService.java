package com.example.onlinestore.service;

import com.example.onlinestore.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product save(Product product);

    Product findById(long id);

    void deleteProduct(Long id);
}
