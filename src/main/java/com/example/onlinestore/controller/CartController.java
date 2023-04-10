package com.example.onlinestore.controller;

import com.example.onlinestore.entity.Cart;
import com.example.onlinestore.service.CartService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/store/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostConstruct
    public void initCarts() {
        cartService.initCarts();
    }

    @GetMapping
    public ResponseEntity<List<Cart>> get() {
        List<Cart> allCarts = cartService.getAllCarts();
        return new ResponseEntity<List<Cart>>(allCarts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cart> post(@RequestBody Cart cart) {
        Cart newCart = cartService.save(cart);
        return new ResponseEntity<Cart>(newCart, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> get(@PathVariable("id") String username) {
        Cart cart = cartService.findByName(username);
        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cart> put(@PathVariable("id") String username, @RequestBody Cart cart) {
        cartService.update(username, cart);
        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String username) {
        cartService.deleteCart(username);
        return new ResponseEntity<String>("Cart was deleted.", HttpStatus.OK);
    }
}
