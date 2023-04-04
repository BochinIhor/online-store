package com.example.onlinestore.service;

import com.example.onlinestore.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();

    Cart save(Cart cart);

    Cart findByName(String username);

    void update(String username, Cart cart);

    void deleteCart(String username);

    void initCarts();
}
