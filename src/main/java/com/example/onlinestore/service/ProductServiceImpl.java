package com.example.onlinestore.service;

import com.example.onlinestore.entity.Product;
import com.example.onlinestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public Product findById(long id) {
        if(productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }
}
