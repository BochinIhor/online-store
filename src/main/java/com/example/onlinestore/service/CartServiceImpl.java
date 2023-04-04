package com.example.onlinestore.service;

import com.example.onlinestore.entity.Cart;
import com.example.onlinestore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Cart save(Cart cart) {
        cartRepository.save(cart);
        return cart;
    }

    @Override
    public Cart findByName(String username) {
        if (cartRepository.findById(username).isPresent()) {
            return cartRepository.findById(username).get();
        }
        return null;
    }

    @Override
    public void update(String username, Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void deleteCart(String username) {
        Cart cart = findByName(username);
        cartRepository.delete(cart);
    }

    public void initCarts() {
        Cart cart1 = new Cart();
        cart1.setUsername("user1");
        cart1.setProducts("1,1;11,1;12,1;15,2");
        cartRepository.save(cart1);
    }
}
