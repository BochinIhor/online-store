package com.example.onlinestore.controller;

import com.example.onlinestore.entity.Product;
import com.example.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/store/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> get() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> post(@RequestBody Product product) {
        Product newProduct = productService.save(product);
        return new ResponseEntity<Product>(newProduct, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable("id") long id) {
        Product product = productService.findById(id);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<String>("Product was deleted.", HttpStatus.OK);
    }

}
