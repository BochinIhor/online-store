package com.example.onlinestore.service;

import com.example.onlinestore.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User save(User user);

    @Transactional
    User findById(String id);

    void update(String username, User user);

    void deleteUser(String id);

    void initRolesAndUser();
}
