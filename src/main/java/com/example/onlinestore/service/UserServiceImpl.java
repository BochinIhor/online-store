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
        adminUser.setPassword("admin");
        adminUser.setRole("admin");
        //adminUser.setCart("1,1;11,1;12,1;15,2");
        userRepository.save(adminUser);

        User user1 = new User();
        user1.setUsername("user1");
        user1.setFirstname("User1");
        user1.setLastname("User1Last");
        user1.setPassword("user1pass");
        user1.setRole("user");
        //user1.setCart("1,1;11,1;12,1;15,2");
        userRepository.save(user1);
    }
}
