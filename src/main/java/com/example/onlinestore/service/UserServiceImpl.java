package com.example.onlinestore.service;

import com.example.onlinestore.entity.User;
import com.example.onlinestore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    @Transactional
    public User findById(String id) {
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        return null;
    }

    @Override
    @Transactional
    public void update(String username, User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        User user = findById(id);
        userRepository.delete(user);
    }

    public void initRolesAndUser() {

        User adminUser = new User();
        adminUser.setUsername("admin");
        adminUser.setFirstname("Admin");
        adminUser.setLastname("Admin");
        adminUser.setPassword("adminpass");
        adminUser.setRole("admin");
        userRepository.save(adminUser);

        User user = new User();
        user.setUsername("user1");
        user.setFirstname("User1");
        user.setLastname("User1Last");
        user.setPassword("user1pass");
        user.setRole("user");
        userRepository.save(user);


    }
}
